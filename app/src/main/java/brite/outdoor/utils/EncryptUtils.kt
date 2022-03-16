package brite.outdoor.utils

import java.util.*
import javax.crypto.Cipher
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.PBEKeySpec
import javax.crypto.spec.SecretKeySpec
import android.util.Base64
import android.util.Log
import kotlinx.coroutines.*
import okhttp3.internal.wait

object EncryptUtils {

    const val secretKey = "tK5UTui+DPh8lIlBxya5XVsmeDCoUl6vHhdIESMB6sQ="
    const val salt = "QWlGNHNhMTJTQWZ2bGhpV3U=" // base64 decode => AiF4sa12SAfvlhiWu
    const val iv = "bVQzNFNhRkQ1Njc4UUFaWA==" // base64 decode => mT34SaFD5678QAZX

    suspend fun encrypt(strToEncrypt: String): String? {
        val cipher = Cipher.getInstance("AES/CBC/PKCS7Padding")
       return GlobalScope.async(Dispatchers.IO) {
            try {
                val ivParameterSpec = IvParameterSpec(Base64.decode(iv, Base64.DEFAULT))

                val factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")
                val spec =
                    PBEKeySpec(secretKey.toCharArray(), Base64.decode(salt, Base64.DEFAULT), 10000, 256)
                val tmp = factory.generateSecret(spec)
                val secretKey = SecretKeySpec(tmp.encoded, "AES")

                cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec)

            } catch (e: Exception) {
                println("Error while encrypting: $e")
            }
           Base64.encodeToString(
               cipher.doFinal(strToEncrypt.toByteArray(Charsets.UTF_8)),
               Base64.DEFAULT
           )
        }.await()

    }

    suspend fun decrypt(strToDecrypt: String): String {
        val cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
      return  GlobalScope.async(Dispatchers.IO){
            try {
                val ivParameterSpec = IvParameterSpec(Base64.decode(iv, Base64.DEFAULT))
                val factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")
                val spec =
                    PBEKeySpec(secretKey.toCharArray(), Base64.decode(salt, Base64.DEFAULT), 10000, 256)
                val tmp = factory.generateSecret(spec);
                val secretKey = SecretKeySpec(tmp.encoded, "AES")


                cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);

            } catch (e: Exception) {
                println("Error while decrypting: $e");
            }
          String(cipher.doFinal(Base64.decode(strToDecrypt, Base64.DEFAULT)))
        }.await()


    }
}

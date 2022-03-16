package brite.outdoor.data.entities

import androidx.lifecycle.MutableLiveData

class PostContentHotNewsEntity {
    var id :Int=0
    var content: String = ""
    var imagePicker : MutableLiveData<ImagePicker> = MutableLiveData()

    constructor()
    constructor(content: String, imagePicker: MutableLiveData<ImagePicker>) {
        this.content = content
        this.imagePicker = imagePicker
    }
    constructor(id:Int,content: String, imagePicker: MutableLiveData<ImagePicker>) {
        this.content = content
        this.imagePicker = imagePicker
        this.id = id
    }
    constructor(content: String){
        this.content=content
    }
}
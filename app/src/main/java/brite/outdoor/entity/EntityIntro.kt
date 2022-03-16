package brite.outdoor.entity

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class EntityIntro {

    var title: Int = 0
    var content: Int = 0
    var image: Int = 0

    constructor(@StringRes title: Int,@StringRes content :Int, @DrawableRes image: Int) {
        this.title = title
        this.content=content
        this.image = image
    }

}
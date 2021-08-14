package com.example.rssreaderwithdagger2.model


import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Content(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("medium")
    var medium: String?, // image
    @SerializedName("url")
    var url: String?, // https://sharadcodes.github.io/assets/uploads/ship.jpg
    @SerializedName("xmlns:media")
    var xmlnsMedia: String? // http://search.yahoo.com/mrss/
)
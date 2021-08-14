package com.example.rssreaderwithdagger2.model


import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Enclosure(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("xmlns:media")
    var xmlnsMedia: String?, // http://search.yahoo.com/mrss/
    @SerializedName("url")
    var url: String?, // https://sharadcodes.github.io/assets/uploads/ship.jpg
    @SerializedName("medium")
    var medium: String? // image
)
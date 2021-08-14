package com.example.rssreaderwithdagger2.model


import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Link(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("href")
    var href: String?, // https://sharadcodes.github.io/feed.xml
    @SerializedName("rel")
    var rel: String?, // self
    @SerializedName("type")
    var type: String? // application/atom+xml
)
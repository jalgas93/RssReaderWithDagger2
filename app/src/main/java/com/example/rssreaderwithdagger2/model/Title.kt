package com.example.rssreaderwithdagger2.model


import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Title(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("type")
    var type: String?, // html
    @SerializedName("t")
    var t: String? // sharadcodes
)
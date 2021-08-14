package com.example.rssreaderwithdagger2.model


import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Media(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("content")
    var content: Content?
)
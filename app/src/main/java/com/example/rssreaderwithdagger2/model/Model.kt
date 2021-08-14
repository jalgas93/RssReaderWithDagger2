package com.example.rssreaderwithdagger2.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Rss_database")
data class Model(

    @PrimaryKey(autoGenerate = true)
    @SerializedName("items")
    var items: List<Item>?,
    @SerializedName("title")
    var title: Title?,
    @SerializedName("link")
    var link: List<Link>?,
    @SerializedName("category")
    var category: List<Any>?
)
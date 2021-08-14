package com.example.rssreaderwithdagger2.cache

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "RssDatabase")
data class RoomModel (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int
)

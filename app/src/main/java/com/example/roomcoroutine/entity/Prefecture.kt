package com.example.roomcoroutine.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Prefecture(
    @PrimaryKey
    val id: Int,
    val name: String,
    val regionId: Int
) {
    init {
        // TODO:require()をつけたい
    }
}
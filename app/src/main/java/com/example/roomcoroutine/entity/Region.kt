package com.example.roomcoroutine.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Region(
    @PrimaryKey
    val id: Int,
    val name: String
) {
    init {
        // TODO:require()をつけたい
    }
}
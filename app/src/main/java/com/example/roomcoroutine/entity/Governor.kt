package com.example.roomcoroutine.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Governor(
    @PrimaryKey
    val id: Int,
    val prefectureId: Int,
    val name: String,
    val kana: String,
    val birthDay: String,
    val gender: Int,
    val wins: Int,
    val expiration: String
){
    init {
        // TODO:require()をつけたい
    }
}
package com.example.roomcoroutine.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomcoroutine.dao.PrefectureDao
import com.example.roomcoroutine.entity.Governor
import com.example.roomcoroutine.entity.Prefecture
import com.example.roomcoroutine.entity.Region

@Database(entities = [Prefecture::class, Governor::class, Region::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun prefectureDao(): PrefectureDao
}
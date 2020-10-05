package com.example.roomcoroutine.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.roomcoroutine.entity.Prefecture

@Dao
interface PrefectureDao {

    @Query("SELECT * FROM prefecture")
    fun getAll(): LiveData<List<Prefecture>>

    @Insert
    suspend fun insert(prefecture: List<Prefecture>)
}
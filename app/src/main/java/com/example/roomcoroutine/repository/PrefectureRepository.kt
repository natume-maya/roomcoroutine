package com.example.roomcoroutine.repository

import androidx.annotation.WorkerThread
import com.example.roomcoroutine.dao.PrefectureDao
import com.example.roomcoroutine.entity.Prefecture

class PrefectureRepository(private val prefectureDao: PrefectureDao) {
    val allPrefectureList = prefectureDao.getAll()

    @WorkerThread
    suspend fun insert(prefecture: List<Prefecture>) {
        prefectureDao.insert(prefecture)
    }
}
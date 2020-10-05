package com.example.roomcoroutine.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomcoroutine.entity.Prefecture
import com.example.roomcoroutine.repository.PrefectureRepository
import kotlinx.coroutines.launch

class PrefectureViewModel(private val prefectureRepository: PrefectureRepository) : ViewModel() {
    val prefectureList = prefectureRepository.allPrefectureList

    fun insert(prefecture: List<Prefecture>) = viewModelScope.launch {
        prefectureRepository.insert(prefecture)
    }
}
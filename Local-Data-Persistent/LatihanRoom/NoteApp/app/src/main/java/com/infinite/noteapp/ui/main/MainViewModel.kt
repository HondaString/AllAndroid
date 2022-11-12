package com.infinite.noteapp.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.infinite.noteapp.database.Note
import com.infinite.noteapp.repository.NoteRepository

class MainViewModel(application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)
    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()
}
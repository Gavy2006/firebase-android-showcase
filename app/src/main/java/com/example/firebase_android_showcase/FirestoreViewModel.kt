package com.example.firebase_android_showcase

import androidx.lifecycle.ViewModel

class FirestoreViewModel : ViewModel() {

    private val repository = FirestoreRepository(
        FirestoreManager()
    )

    fun saveUser(
        uid: String,
        email: String,
        name: String,
        age: String,
        city: String,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        repository.saveUser(
            uid,
            email,
            name,
            age,
            city,
            onSuccess,
            onError
        )
    }
}
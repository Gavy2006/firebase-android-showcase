package com.example.firebase_android_showcase

import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    private val repository = AuthRepository(
        AuthManager()
    )

    fun signup(
        email: String,
        password: String,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        repository.signup(
            email,
            password,
            onSuccess,
            onError
        )
    }

    fun login(
        email: String,
        password: String,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        repository.login(
            email,
            password,
            onSuccess,
            onError
        )
    }
}
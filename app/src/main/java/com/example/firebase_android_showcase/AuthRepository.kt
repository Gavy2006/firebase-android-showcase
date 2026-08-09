package com.example.firebase_android_showcase

class AuthRepository(
    private val manager: AuthManager
) {

    fun signup(
        email: String,
        password: String,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        manager.signUp(
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
        manager.login(
            email,
            password,
            onSuccess,
            onError
        )
    }
}
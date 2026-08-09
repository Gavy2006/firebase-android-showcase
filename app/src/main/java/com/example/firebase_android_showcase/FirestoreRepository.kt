package com.example.firebase_android_showcase

class FirestoreRepository(
    private val firestoreManager: FirestoreManager
) {

    fun saveUser(
        uid: String,
        email: String,
        name: String,
        age: String,
        city: String,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        firestoreManager.saveUser(
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
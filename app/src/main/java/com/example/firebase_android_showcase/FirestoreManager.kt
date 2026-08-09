package com.example.firebase_android_showcase

import com.google.firebase.firestore.FirebaseFirestore

class FirestoreManager {

    private val firestore = FirebaseFirestore.getInstance()


    fun saveUser(
        uid: String,
        email: String,
        name: String,
        age: String,
        city: String,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        firestore.collection("users")
            .document(uid)
            .set(
                mapOf(
                    "email" to email,
                    "name" to name,
                    "age" to age,
                    "city" to city
                )
            )
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener { exception ->
                onError(exception.message ?: "Unable to save profile")
            }
    }
}
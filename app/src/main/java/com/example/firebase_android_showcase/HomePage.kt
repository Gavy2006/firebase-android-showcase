package com.example.firebase_android_showcase

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun HomePage(navController: NavController){

    Text("HomePage")

    Button(onClick = {navController.navigate("profile")}) {
        Text("profile")
    }
}
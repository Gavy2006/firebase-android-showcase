package com.example.firebase_android_showcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.firebase_android_showcase.ui.theme.FirebaseandroidshowcaseTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val viewModel = ViewModelProvider(this)[AuthViewModel::class.java]
            val firestoreViewModel =
                ViewModelProvider(this)[FirestoreViewModel::class.java]

            FirebaseandroidshowcaseTheme {
                AppNavigation(viewModel , firestoreViewModel)
            }
        }
    }
}




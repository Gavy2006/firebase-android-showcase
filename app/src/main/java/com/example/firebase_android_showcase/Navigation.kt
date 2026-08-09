package com.example.firebase_android_showcase

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation( authViewModel: AuthViewModel ,firestoreViewModel: FirestoreViewModel) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            LoginPage(authViewModel ,navController)
        }

        composable("signup") {
            SignupPage(authViewModel ,navController , firestoreViewModel)
        }

        composable("home") {
            HomePage(navController)
        }

        composable("profile") {
         ProfilePage(firestoreViewModel)
        }
    }
}
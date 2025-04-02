package com.tomtech.codlabjetpack

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("details/{id}") {backStackEntry ->
            val id = backStackEntry.arguments?.getString("id") ?: "Sin ID"
            DetailsScreen(navController,id)
        }
    }

}


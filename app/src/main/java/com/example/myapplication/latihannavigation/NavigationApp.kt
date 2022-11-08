package com.example.myapplication.latihannavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationApp(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "screen_satu"
    ) {
        composable(NavRoute.screen_satu.name) {
            ScreenSatu(navController)
        }
        composable(NavRoute.screen_dua.name) {
            ScreenDua(navController)
        }
    }
}
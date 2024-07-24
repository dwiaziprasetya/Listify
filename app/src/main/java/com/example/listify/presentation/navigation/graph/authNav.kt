package com.example.listify.presentation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.listify.presentation.navigation.model.Screen
import com.example.listify.presentation.ui.screen.welcome.WelcomeScreen

fun NavGraphBuilder.authNav(){
    navigation(
        startDestination = Screen.Welcome.route,
        route = Screen.AuthNav.route
    ) {
        composable(
            route = Screen.Welcome.route
        ) {
            WelcomeScreen()
        }
    }
}
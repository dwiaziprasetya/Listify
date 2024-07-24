package com.example.listify.presentation.navigation.model

sealed class Screen(val route: String) {
    data object Welcome : Screen("welcome")
}
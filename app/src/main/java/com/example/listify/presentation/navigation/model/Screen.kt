package com.example.listify.presentation.navigation.model

sealed class Screen(val route: String) {
    data object Welcome : Screen("welcome")
    data object Root : Screen("root")
    data object AuthNav : Screen("authNav")
    data object Main : Screen("main")
}
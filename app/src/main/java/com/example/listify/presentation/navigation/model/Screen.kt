package com.example.listify.presentation.navigation.model

sealed class Screen(val route: String) {
    data object Welcome : Screen("welcome")
    data object Root : Screen("root")
    data object AuthNav : Screen("authNav")
    data object Main : Screen("main")
    data object Home : Screen("home")
    data object Task : Screen("task")
    data object Profile : Screen("profile")
    data object Notification : Screen("notification")
    data object AddTaskDummy : Screen("addTaskDummy")
    data object AddTask : Screen("addTask")
}
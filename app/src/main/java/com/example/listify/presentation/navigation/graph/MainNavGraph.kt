package com.example.listify.presentation.navigation.graph

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.listify.presentation.navigation.model.Screen
import com.example.listify.presentation.ui.screen.home.HomeScreen
import com.example.listify.presentation.ui.screen.notification.NotificationScreen
import com.example.listify.presentation.ui.screen.profile.ProfileScreen
import com.example.listify.presentation.ui.screen.task.TaskScreen

@Composable
fun MainNavGraph(
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        route = Screen.Main.route,
        modifier = Modifier.padding(paddingValues)
    ) {
        authNav()
        composable(route = Screen.Home.route) { HomeScreen() }
        composable(route = Screen.Task.route) { TaskScreen() }
        composable(route = Screen.Notification.route) { NotificationScreen() }
        composable(route = Screen.Profile.route) { ProfileScreen() }
    }
}
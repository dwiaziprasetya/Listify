package com.example.listify.presentation.navigation.model

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomBarItem(
    val title: String,
    val icon: ImageVector,
    val iconSelected: ImageVector,
    val screen: Screen
)

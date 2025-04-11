package com.felix.harakamall.navigation

import android.content.ClipData.Item
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.felix.harakamall.ui.Screens.about.AboutScreen
import com.felix.harakamall.ui.Screens.contact.ContactScreen
import com.felix.harakamall.ui.Screens.dashboard.DashboardScreen
import com.felix.harakamall.ui.Screens.form.FormScreen
import com.felix.harakamall.ui.Screens.intent.IntentScreen
import com.felix.harakamall.ui.Screens.item.ItemScreen
import com.nyokabi.harakamall.ui.screens.Home.HomeScreen
import com.nyokabi.harakamall.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_DASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASH) {
            DashboardScreen(navController)
        }
        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }
        composable(ROUT_FORM) {
            FormScreen(navController)
        }




    }
}


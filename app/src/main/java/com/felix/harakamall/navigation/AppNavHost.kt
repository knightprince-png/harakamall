package com.felix.harakamall.navigation

import android.content.ClipData.Item
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.node.ViewAdapter
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.felix.harakamall.data.UserDatabase
import com.felix.harakamall.repository.UserRepository
import com.felix.harakamall.ui.Screens.about.AboutScreen
import com.felix.harakamall.ui.Screens.auth.LoginScreen
import com.felix.harakamall.ui.Screens.auth.RegisterScreen
import com.felix.harakamall.ui.Screens.contact.ContactScreen
import com.felix.harakamall.ui.Screens.dashboard.DashboardScreen
import com.felix.harakamall.ui.Screens.form.FormScreen
import com.felix.harakamall.ui.Screens.form1.Form2Screen
import com.felix.harakamall.ui.Screens.intent.IntentScreen
import com.felix.harakamall.ui.Screens.item.ItemScreen
import com.felix.harakamall.viewmodel.AuthViewModel
import com.nyokabi.harakamall.ui.screens.Home.HomeScreen
import com.nyokabi.harakamall.ui.screens.start.StartScreen
import java.text.Normalizer.Form

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_FORM2
) {
val context = LocalContext.current
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
        composable(ROUT_FORM2) {
            Form2Screen(navController)
        }

        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }





    }
}


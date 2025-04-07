package com.felix.harakamall.ui.Screens.about

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nyokabi.harakamall.ui.screens.Home.HomeScreen

@Composable
fun AboutScreen(navController: NavController){}


@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){

    AboutScreen(rememberNavController())

}
package com.felix.harakamall.ui.Screens.Splash

import android.annotation.SuppressLint
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.felix.harakamall.R
import com.felix.harakamall.navigation.ROUT_LOGIN
import com.felix.harakamall.navigation.ROUT_START
import com.felix.harakamall.ui.theme.blue
import com.felix.harakamall.ui.theme.white
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun  SplashScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize().background(blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(R.drawable.img_4),
            contentDescription = "home",
            modifier = Modifier
                .size(30.dp)

        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Haraka Mall",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold

        )


    }
    //navigation

    val coroutine = rememberCoroutineScope()
    coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_LOGIN)

    }

    //end of navigation

}

@Preview(showBackground = true)
@Composable
fun  SplashScreenPreview(){
    SplashScreen(rememberNavController())
}
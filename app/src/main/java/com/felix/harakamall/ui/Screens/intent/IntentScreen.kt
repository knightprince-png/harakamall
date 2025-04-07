package com.felix.harakamall.ui.Screens.intent

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.felix.harakamall.navigation.ROUT_ITEM
import com.felix.harakamall.ui.theme.blue
import com.felix.harakamall.ui.theme.white

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){
        //TopAppBar
        TopAppBar(
            title = { Text(text = "INTENTS") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = blue,
                titleContentColor = white,
                navigationIconContentColor = white,
                actionIconContentColor = white
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")

                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "Shop")

                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "Notifications")

                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "Notifications")

                }
            }
        )//end

        Spacer(modifier = Modifier.height(30.dp))
        //BUTTON STK
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(blue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

        ) {
            Text( text = "MPESA")
        }
        Spacer(modifier = Modifier.height(30.dp))
        //BUTTON STK
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(blue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

        ) {
            Text( text = "MPESA")
        }
        Spacer(modifier = Modifier.height(30.dp))
        //BUTTON STK
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(blue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

        ) {
            Text( text = "MPESA")
        }
        Spacer(modifier = Modifier.height(30.dp))
        //BUTTON STK
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(blue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

        ) {
            Text( text = "MPESA")
        }
        Spacer(modifier = Modifier.height(30.dp))
        //BUTTON STK
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(blue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp)

        ) {
            Text( text = "MPESA")
        }



    }
}


@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){

    IntentScreen(rememberNavController())

}
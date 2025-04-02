package com.felix.harakamall.ui.Screens.item

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.felix.harakamall.ui.theme.blue
import com.felix.harakamall.ui.theme.white

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(){
    Column (modifier = Modifier.fillMaxSize()){
        //TopAppBar
        TopAppBar(
            title = { Text(text = "PRODUCTS") },
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
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Shop")

                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notifications")

                }
                }
        )//end
    }

}
@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen()
}
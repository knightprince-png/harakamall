package com.nyokabi.harakamall.ui.screens.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.felix.harakamall.R


@Composable
fun HomeScreen(){

    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = "HarakaMall",
            fontSize = 30.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.ExtraBold

        )

        Image(painter = painterResource(R.drawable.img),
            contentDescription = "img"
        )




        Text(
            text = "Welcome to my app",
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic
        )

        Text(
            text = "welcome to my mall where all services are important and available with an affordable budget",
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic
        )

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text( text = "Add to cart")
        }

    }



}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){

    HomeScreen()

}
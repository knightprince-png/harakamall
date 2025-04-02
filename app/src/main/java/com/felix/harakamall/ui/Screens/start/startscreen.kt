package com.felix.harakamall.ui.Screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.felix.harakamall.R
import com.felix.harakamall.ui.theme.blue

@Composable
fun StartScreen(){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "Harakamall",
            fontSize = 20.sp
        )
        //to create space within the code
        Spacer(modifier = Modifier.height(20.dp))

        //circular image
        Image(painter = painterResource(R.drawable.img_1),
            contentDescription = "img",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )//end
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Find your order" ,
            fontSize = 35.sp,
            fontWeight = FontWeight.ExtraBold,
            color = blue
        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "The best-prebuilt gaming PC for GTA 5 is the CybertronPC Palladium 970X RGB. This PC has an 8GB RX 580 graphics card with overclocking capabilities and an AMD Ryzen 7 1700 CPU. The can handle handle GTA GTA 5.7 ",
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(blue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

        ) {
            Text( text = "Get started")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen()
}
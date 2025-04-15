package com.felix.harakamall.ui.Screens.form1

import android.os.Build.VERSION_CODES.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.AutofillType
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun Form2Screen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF2F2F2)), // Light gray background
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(300.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(Color.White)
                .padding(24.dp)
        ) {
            // Top image section
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF1F3C88), RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                    .padding(vertical = 32.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = null,
                        tint = Color.Red,
                        modifier = Modifier.size(40.dp)
                    )
                    Text(
                        text = "Logo App",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "The Most Worth Grocery App",
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = "Username",
                onValueChange = {},
                label = { Text("Username") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = "password",
                onValueChange = {},
                label = { Text("Password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth(),


            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { /* TODO */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {
                Text(text = "Sign Up", color = Color.White)
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Already are members? Log in",
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}




@Preview(showBackground = true)
@Composable
fun Form2ScreenPreview(){

    Form2Screen(rememberNavController())

}
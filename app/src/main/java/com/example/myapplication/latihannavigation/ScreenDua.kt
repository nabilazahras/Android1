package com.example.myapplication.latihannavigation

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.R

@Composable
fun ScreenDua(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = {
                      navController.popBackStack();
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xffAE8625),
                contentColor = Color.White
            )
        ){
            Text(text = "Hallo Mahasiswa")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ScreenDuaPreview(){
    ScreenDua(rememberNavController())
}

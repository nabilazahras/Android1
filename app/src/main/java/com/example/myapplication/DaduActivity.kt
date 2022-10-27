package com.example.myapplication

import android.media.Image
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class DaduActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
        }
    }
}

@Composable
fun DiceApp() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        var diceValue by remember {
            mutableStateOf(1)
        }
        val image= when (diceValue) {
            1
            2
        }
        Image(
            painter = painterResource(id = R.drawable.dice_1),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(28.dp))
        Button(
            OnClick = {
                      diceValue = (listOf<Int>(1,6).random()},
            content = {
                Text(text = "Roll")
            }
        )
    }
}
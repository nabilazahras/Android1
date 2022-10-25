package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val warnaUngu = 0xffc791c7

        setContent {
            Column() {
                Surface(
                    color = Color.Cyan,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Halo halo Bandung",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                        color = Color(warnaUngu)
                    )
                }
                Surface(
                    color = Color.Magenta,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Ibu kota perjuangan",
                        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                        color = Color.White
                    )
                }
            }
        }
    }
}
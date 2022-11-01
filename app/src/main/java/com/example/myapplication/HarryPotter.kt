// Tugas Aplikasi Mobile Computing
// Nabila Zahra Salsabila
// 191344021 (4-TNK)

package com.example.myapplication

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HarryPotter : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showHarryPotter()
        }
    }
}

fun getWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}
fun getHeight(): Int {
    return Resources.getSystem().displayMetrics.heightPixels
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showHarryPotter() {
    val screenWidth = getWidth() * 0.12681;
    val screenHeight = getHeight() * 0.1905;
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Surface(
                color = Color(0XFFAE8625),
                modifier = Modifier.size(screenWidth.dp, screenHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hogwartss),
                        contentDescription = "Hogwarts",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text = "HOGWARTS",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Dumbledore",
                        fontSize = 12.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0XFF781616),
                modifier = Modifier.size(screenWidth.dp, screenHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.gryffindor),
                        contentDescription = "Gryffindor",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text = "GRYFFINDOR",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Harry Potter",
                        fontSize = 12.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0XFF164030),
                modifier = Modifier.size(screenWidth.dp, screenHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.slytherin),
                        contentDescription = "Slytherin",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text = "SLYTHERIN",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Draco Malfoy",
                        fontSize = 12.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                color = Color(0XFF182354),
                modifier = Modifier.size(screenWidth.dp, screenHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ravenclaw),
                        contentDescription = "Ravenclaw",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text = "RAVENCLAW",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Luna Lovegood",
                        fontSize = 12.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0XFFF5D902),
                modifier = Modifier.size(screenWidth.dp, screenHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hufflepuff),
                        contentDescription = "Hufflepuff",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text = "HUFFLEPUFF",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Cedric Diggory",
                        fontSize = 12.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0XFF333336),
                modifier = Modifier.size(screenWidth.dp, screenHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.voldemort),
                        contentDescription = "Voldemort",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        text = "VOLDEMORT",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Tom Marvolo Riddle",
                        fontSize = 12.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}
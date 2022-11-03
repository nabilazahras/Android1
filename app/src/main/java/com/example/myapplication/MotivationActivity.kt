package com.example.myapplication

import com.example.myapplication.Data.ListMotivation
import com.example.myapplication.Model.Motivation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MotivationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MotivationApp(listMotivation = ListMotivation().loadMotivation())
        }
    }
}

@Composable
fun MotivationApp(listMotivation: List<Motivation>) {
    LazyColumn {
        items(listMotivation) { motivation ->
            MotivationCard(motivation = motivation)
        }
    }
}

@Composable
fun MotivationCard(motivation: Motivation) {
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column() {
            Image(
                painter = painterResource(id = motivation.imageResouceId),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(id = motivation.textResourcedId),
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.h6
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MotivationCardPreview() {
    MotivationApp(listMotivation = ListMotivation().loadMotivation())
}

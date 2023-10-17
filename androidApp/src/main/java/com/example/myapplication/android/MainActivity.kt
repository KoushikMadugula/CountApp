package com.example.myapplication.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //GreetingView(Greeting().greet())
                    CounterApp()
                }
            }
        }
    }
}

@Preview
@Composable
fun CounterApp(){
    var count by remember { mutableStateOf(0) }
    Column {
        Text(count.toString())
        Row {
            Button(onClick = { ++count }) {
                Text(text = "Increment")
            }
            Button(onClick = { --count }) {
                Text(text = "Decrement")
            }
        }
    }
}


package com.example.github

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme

import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import com.example.github.Screen.DetailsScreen
import com.example.github.ui.theme.GitHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitHubTheme {
                  DetailsScreen()
                }
            }
        }
    }



/*
@Preview(showBackground = true)
@Composable
fun DetailsScreenPreview()
{
    DetailsScreen()
}*/
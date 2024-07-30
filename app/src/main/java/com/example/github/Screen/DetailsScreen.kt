package com.example.github.Screen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.github.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(){
    Column(
        modifier = Modifier .fillMaxSize() .padding(120.dp),
        horizontalAlignment = Alignment.CenterHorizontally )
    { // Google logo
    Image( painter = painterResource(id = R.drawable.google),
     contentDescription = "Google Logo",
        modifier = Modifier.size(100.dp) )
        Spacer(modifier = Modifier.height(16.dp))
    // Title
     Text( text = "language",
         fontSize = 24.sp,
         fontWeight = FontWeight.Bold )
        Spacer(modifier = Modifier.height(8.dp))
    Row(
        verticalAlignment = Alignment.CenterVertically )
    {
        Text(text = "1525")
        Spacer(modifier = Modifier.width(4.dp))
        Icon( imageVector = Icons.Default.Star,
            contentDescription = "Star",
            tint = Color.Yellow )
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = "Python")
        Spacer(modifier = Modifier.width(4.dp))
        Icon(imageVector = Icons.Default.AddCircle,
            contentDescription = "Circle ",
            tint = Color.Blue)
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "347") }
        Spacer(modifier = Modifier.width(4.dp))
        Icon( imageVector = Icons.Default.Info ,
            contentDescription = "Fork",
            tint = Color.Black )
        Spacer(modifier = Modifier.width(16.dp))

    // Description
    Text( text = "Shared repository for open-sourced projects from the Google AI Language team.",
        fontSize = 16.sp,
        textAlign = TextAlign.Center )
        Spacer(modifier = Modifier.height(120.dp))
     Button(onClick = { /* TODO: Handle button click */ })
     { Text(text = "Show Issues") } }
    }


@Preview(showBackground = true)
@Composable
fun DetailsScreenPreview()
{
    DetailsScreen()
}

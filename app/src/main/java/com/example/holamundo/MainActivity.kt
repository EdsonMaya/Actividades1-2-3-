package com.example.holamundo

import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Alignment


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.holamundo.components.TheBox2
import com.example.holamundo.ui.theme.HolaMundoTheme
import com.example.holamundo.ui.theme.myCustomFont

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HolaMundoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TheBox2()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(Modifier.fillMaxSize()) {
    Text(
        text = stringResource(R.string.greeting2),
        color = Color(0xD8714CB3),
        fontSize = 54.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraLight,
        fontFamily = myCustomFont,
        textAlign = TextAlign.Center,
        maxLines = 2,
        lineHeight= 1.2.em,
             modifier = Modifier
                 .background(Color(0xFFFFFF))
                 .align(Alignment.Center)
                 .graphicsLayer {
                     this.rotationX = 9f
                     this.rotationY = 9f
                     this.rotationZ = 9f
}
    )
}
}

@Preview(showBackground = true, locale="es")
@Composable
fun GreetingPreview() {
    HolaMundoTheme {
        Greeting("Android")
    }
}
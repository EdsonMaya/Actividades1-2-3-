package com.example.holamundo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Act1(){
    Row() { //dentro de las llaves los modificaciones
        /*Aqui el contenido */
        Column(
            modifier = Modifier.height(138.dp).width(138.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "C1", modifier = Modifier
                    .background(Color.Yellow)
                    .padding(14.dp)
            )

            Text(
                text = "C2", modifier = Modifier
                    .background(Color.Green)
                    .padding(14.dp)
            )

            Text(
                text = "C3", modifier = Modifier
                    .background(Color.Magenta)
                    .padding(14.dp)
            )

        }
    }
    Row( ) { //dentro de las llaves los modificaciones
        /*Aqui el contenido */
        Column(
            modifier = Modifier.height(138.dp).width(138.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "C4", modifier = Modifier
                    .background(Color.Blue)
                    .padding(14.dp)
            )

            Text(
                text = "C5", modifier = Modifier
                    .background(Color.DarkGray)
                    .padding(14.dp)
            )

            Text(
                text = "C6", modifier = Modifier
                    .background(Color.Red)
                    .padding(14.dp)
            )
        }
    }
    Row( ) { //dentro de las llaves los modificaciones
        /*Aqui el contenido */
        Column(
            modifier = Modifier.height(138.dp).width(138.dp),
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = "C7", modifier = Modifier
                    .background(Color.Magenta)
                    .padding(14.dp)
            )

            Text(
                text = "C8", modifier = Modifier
                    .background(Color.Cyan)
                    .padding(14.dp)
            )

            Text(
                text = "C9", modifier = Modifier
                    .background(Color.Gray)
                    .padding(14.dp)
            )
        }
    }
}


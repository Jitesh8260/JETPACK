package com.example.jetpack.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CreateButton(){
    Button(modifier = Modifier.padding(horizontal = 15.dp),
        onClick = {},
        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
    ) {
        Text(text = "Login")
    }
}
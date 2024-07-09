package com.example.jetpack.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextField1() {
    var valueOfField by remember { mutableStateOf(TextFieldValue("")) }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .height(90.dp)
            .width(411.dp)
    ) {
        OutlinedTextField(
            value = valueOfField,
            onValueChange = { valueOfField = it },
            label = { Text(text = "Email ID or Mobile Number") },
            colors = TextFieldDefaults.textFieldColors(containerColor = Color(224, 240, 243))

        )

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextField2() {
    var valueOfField by remember { mutableStateOf(TextFieldValue("")) }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .height(90.dp)
            .width(411.dp)
    ) {
        OutlinedTextField(
            value = valueOfField,
            onValueChange = { valueOfField = it },
            label = { Text(text = "Password") },
            trailingIcon ={ Icon(Icons.Default.Lock, contentDescription ="" )},
            colors = TextFieldDefaults.textFieldColors(containerColor = Color(224, 240, 243))

        )

    }
}
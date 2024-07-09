package com.example.jetpack

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.components.CreateButton
import com.example.jetpack.components.TextField1
import com.example.jetpack.components.TextField2
import com.example.jetpack.ui.theme.JetpackTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
            Card(
                modifier = Modifier
                    .padding(20.dp, top = 50.dp)
                    .width(370.dp)
                    .height(520.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(224,240,243)
                ),
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Text(
                        text = "Jetpack Compose",
                        modifier = Modifier
                            .padding(10.dp)
                            .align(Alignment.CenterHorizontally),
                        color = Color(23,75,119),
                        fontSize = 30.sp
                    )
                    Image(
                        painter = painterResource(id = R.drawable.jetpack), contentDescription = null,
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = "Login",
                        modifier = Modifier
                            .padding(10.dp),
                        color = Color(44,111,19),
                        fontSize = 30.sp
                    )
                    TextField1()
                    TextField2()
                    Text(
                        text = "Forgot Password?", textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(horizontal = 100.dp)
                            .align(Alignment.CenterHorizontally),
                        color = Color(44,111,19),
                        fontSize = 10.sp
                    )
                    CreateButton()
                    }
                }
                Row(modifier = Modifier
                    .padding(horizontal = 80.dp, vertical = 25.dp)) {
                    Text(
                        text = "Don't have an account?",
                        fontSize = 15.sp)
                    Text(
                        text = " Register",
                        color = Color.Blue,
                        fontSize = 15.sp)
                }
            }
            }
        }
        }




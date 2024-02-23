package com.stu25956.LoginPageMobileServer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stu25956.class22022024.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myLogin()
        }
    }
}

@Composable
fun topPart() {
    val image = painterResource(id = R.drawable.logo)
    Spacer(modifier = Modifier.height(20.dp))
    Image(
        painter = image,
        contentDescription = "Logo",
        modifier = Modifier
            .height(100.dp)
            .width(100.dp)
    )
    Text(
        text = "Mobile Server Name",
        fontSize = 30.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold
    )
    Text(
        text = "Please provide your server credentials",
        fontSize = 18.sp,
        color = Color.White
    )
}

@Composable
fun myLoginBox() {
    Box(modifier = Modifier
        .height(200.dp)
        .width(350.dp)
        .background(Color.White)
    )
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
        ) {
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = "Username",
                onValueChange = {})

            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = "Password",
                onValueChange = {})
        }
    }
}

@Composable
fun buttonsPart() {
    Row(
        modifier = Modifier
            .padding(10.dp)
            .width(350.dp),
        //horizontalArrangement = Arrangement.SpaceAround,
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .weight(1f),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Gray,
            ),
        ) {
            Text(text = "CANCEL")
        }

        Spacer(modifier = Modifier.width(10.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .weight(1f),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Red
            ),
        ) {
            Text(text = "LOGIN")
        }
    }
}

@Composable
fun bottomPart() {
    Spacer(modifier = Modifier.height(5.dp))
    Text(
        text = "Footer text goes here",
        fontSize = 20.sp,
        color = Color.White
    )
}

@Composable
fun myLogin() {
    Surface(
        color = Color.Red,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxSize(),
        ) {
            topPart()
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
                ) {
                myLoginBox()
                buttonsPart()
            }
            bottomPart()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    myLogin()
}


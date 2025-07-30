package com.example.dicerollreal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dicerollreal.ui.theme.DiceRollRealTheme
val shape = RoundedCornerShape(20.dp)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DiceRollRealTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                    ) {
                        Greeting(name = "Kevin")
                        Dice()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .padding(0.dp)
        .background(Color.Black)
        .height(100.dp)
        .fillMaxWidth(),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "Hello, Welcome $name!",
            color = Color.White,
            fontSize = 35.sp
        )
    }
}
@Composable
fun Dice(modifier: Modifier = Modifier){
    var diceRolled by remember {
        mutableStateOf(false)
    }
    var diceNumber by remember {
        mutableIntStateOf(1)
    }
    val diceImage = if (diceRolled == false) {
        R.drawable.dice_random // shown before any click
    } else {
        when (diceNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(modifier = Modifier
            .padding(horizontal = 5.dp)
            .clip(shape)
            .border(2.dp, Color.Black, shape),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = diceImage),
                contentDescription = if (diceRolled == false) "Default Dice" else "Dice $diceNumber",
                modifier = Modifier
                    .size(300.dp)
                    .clickable {
                        diceRolled = true
                        diceNumber = (1..6).random()
                    }
            )
        }
        Box(modifier = Modifier
            .padding(horizontal = 5.dp)
            .clip(shape)
            .background(Color.White)
            .height(50.dp)
            .width(150.dp)
            .border(2.dp, Color.Black, shape)
            .clickable {
                diceRolled = false
            },
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "click to refresh",
                fontSize = 18.sp
            )
        }
    }
}
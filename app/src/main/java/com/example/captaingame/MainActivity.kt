package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
captainGame()
                }
            }
        }
    }
}
@Composable()
fun captainGame(){
    val treasureFound = remember { mutableStateOf(0) }
    val direction = remember {mutableStateOf("North")}
    val stormOrTreasure = remember { mutableStateOf("") }

    Column{
        Text("Treasure Found: ${treasureFound.value}")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Direction: ${direction.value}")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "stormOrTreasure: ${stormOrTreasure.value}")
        Spacer(modifier = Modifier.height(16.dp))


        Button(onClick =
        {
            direction.value="East"
            if (Random.nextBoolean()) {
                treasureFound.value += 1
                stormOrTreasure.value = "Found a Treasure!"
            } else {
                stormOrTreasure.value = "Storm Ahead!"
            }
        })
        {
            Text("Sail East")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick =
        {
            direction.value="West"
            if (Random.nextBoolean()) {
                treasureFound.value += 1
                stormOrTreasure.value = "Found a Treasure!"
            } else {
                stormOrTreasure.value = "Storm Ahead!"
            }
        })
        {
            Text("Sail West")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick =
        {
            direction.value="North"
            if (Random.nextBoolean()) {
                treasureFound.value += 1
                stormOrTreasure.value = "Found a Treasure!"
            } else {
                stormOrTreasure.value = "Storm Ahead!"
            }
        })
        {
            Text("Sail North")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick =
        {
            direction.value="South"
            if (Random.nextBoolean()) {
                treasureFound.value += 1
                stormOrTreasure.value = "Found a Treasure!"
            } else {
                stormOrTreasure.value = "Storm Ahead!"
            }
        })
        {
            Text("Sail South")
        }


    }





}
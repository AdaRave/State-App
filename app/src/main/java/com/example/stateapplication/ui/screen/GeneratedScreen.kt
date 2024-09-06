package com.example.stateapplication.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GeneratedScreen(modifier: Modifier = Modifier) {
    val drinks = listOf("кофе", "чай", "сок", "молоко", "кефир")
    val sweets = listOf("кофеты", "батончики", "печенье", "пирожок")

    var drink by remember {
        mutableStateOf("")
    }
    var sweet by remember {
        mutableStateOf("")
    }
    val generatedDink = { value: String ->
        drink = value
    }
    val generatedSweet = { value: String ->
        sweet = value
    }


    Column(modifier = Modifier.padding(top = 50.dp)) {

        Text(text = drink, fontSize = 20.sp)
        GeneratedButton(list = drinks, onClicksGenerated = generatedDink)

        Text(text = sweet, fontSize = 20.sp)
        GeneratedButton(list = sweets, onClicksGenerated = generatedSweet)
    }

}

@Composable
fun GeneratedButton(list: List<String>, onClicksGenerated: (String) -> Unit) {
    Button(onClick = {
        val randomNumber = (0..<list.size).random()
        onClicksGenerated(list[randomNumber])
    }) {
        Text(text = "Generated")
    }
}



@Preview
@Composable
private fun GeneratedScreenPrev() {
    GeneratedScreen()
}
package com.example.textfeild1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.textfeild1.ui.theme.TextFeild1Theme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFeild1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CaixaDeTexto()
                }
            }
        }
    }
}

@Composable
fun  CaixaDeTexto()
{
    var letras by remember { mutableStateOf("aaa") }
     TextField(value = letras, onValueChange = {letras = it })
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TextFeild1Theme {
        CaixaDeTexto()
    }
}
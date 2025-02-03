package com.example.a7_unit_converter_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.a7_unit_converter_app.ui.theme._7_unit_converter_appTheme
/*class MainActivity : ComponentActivity() {
    // MainActivity inherits from ComponentActivity, serving as the entry point of the app.
    override fun onCreate(savedInstanceState: Bundle?) {
        // The onCreate method is overridden to set up the activity when it is created.
        super.onCreate(savedInstanceState)
        // Calls the superclass's onCreate method to perform essential setup.

        enableEdgeToEdge()
        // Custom function (possibly user-defined) to enable edge-to-edge display.

        setContent {
            // Sets the content view using Jetpack Compose rather than the traditional XML layout.
            _7_unit_converter_appTheme {
                // Applies a custom Material theme to the app UI components.
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Scaffold provides a basic layout structure (like AppBar, FAB).
                    // Modifier.fillMaxSize() makes it fill the entire screen space.

                    Greeting(
                        name = "Android",
                        // Calls a composable function Greeting and passes "Android" as an argument.

                        modifier = Modifier.padding(innerPadding)
                        // Adds padding inside the composable to prevent UI overlap with system components.
                    )
                }
            }
        }
    }
}*/

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _7_unit_converter_appTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
                        UnitConverter()
                    }
                }
            }
        }
    }
}

@Composable
fun UnitConverter(){
    Column {
        Text("Unit Converter")
        OutlinedTextField(value = "", onValueChange = {})
        Row {
        }
        Text("Result")
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview(){
    UnitConverter()
}

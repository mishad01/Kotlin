package com.example.a7_unit_converter_app

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    Surface(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        UnitConverter()
                    }
                }
            }
        }
    }
}

@Composable
fun UnitConverter() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Unit Converter",
            color = Color.Blue,
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {})
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Box {
                Button(onClick = {}) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = true, onDismissRequest = {}) {
                    DropdownMenuItem(text = { Text("Centimeters ") }, onClick = {})
                    DropdownMenuItem(text = { Text("Meters ") }, onClick = {})
                    DropdownMenuItem(text = { Text("Feet ") }, onClick = {})
                    DropdownMenuItem(text = { Text("Millimeters ") }, onClick = {})
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                Button(onClick = {}) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = false, onDismissRequest = {}) {
                    DropdownMenuItem(text = { Text("Centimeters ") }, onClick = {})
                    DropdownMenuItem(text = { Text("Meters ") }, onClick = {})
                    DropdownMenuItem(text = { Text("Feet ") }, onClick = {})
                    DropdownMenuItem(text = { Text("Millimeters ") }, onClick = {})
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
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
fun UnitConverterPreview() {
    UnitConverter()
}

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import kotlin.math.round
import kotlin.math.roundToInt
import kotlin.random.Random

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
fun CaptainGame(){
    val treasureFound = remember { mutableStateOf(0) }
    val direction = remember { mutableStateOf("North")}
    val stormOrTreasure =remember { mutableStateOf("")}
    Column (horizontalAlignment = Alignment.CenterHorizontally){

        Text(text = "Treasures Found: ${treasureFound.value}")
        Text(text = "Treasures Found: ${direction.value}")
        Text(text = "Treasures Found: ${stormOrTreasure.value}")
        Button(onClick = {
            direction.value = "East";
            if (Random.nextBoolean()){
                treasureFound.value +=1;
            }
        }) {
            Text("Sail East")
        }
        Button(onClick = {
            direction.value = "West";
            if (Random.nextBoolean()){
                treasureFound.value +=1;
                stormOrTreasure.value = "We Found A treasure";
            }else{
                stormOrTreasure.value = "Storm Ahead";
            }
        }) {
            Text("Sail West")
        }
        Button(onClick = {
            direction.value = "North";
            if (Random.nextBoolean()){
                treasureFound.value +=1;
            }
        }) {
            Text("Sail North")
        }
        Button(onClick = {
            direction.value = "South";
            treasureFound.value +=1;
        }) {
            Text("Sail South")
        }
    }
}

@Composable
fun UnitConverter() {
    var inputValue  by remember { mutableStateOf("") }
    var outputValue  by remember { mutableStateOf("") }
    var inputUnit  by remember { mutableStateOf("Meters") }
    var outputUnit  by remember { mutableStateOf("Meters") }
    var iExpanded  by remember { mutableStateOf(false) }
    var oExpanded  by remember { mutableStateOf(false) }

    val conversionFactor = remember { mutableStateOf(1.00) }
    val oconversionFactor = remember { mutableStateOf(1.00) }

    fun convertUnits() {
        val inputValueDouble = inputValue.toDoubleOrNull() ?: 0.0
        val result = (inputValueDouble * conversionFactor.value * 100.0 / oconversionFactor.value).roundToInt() / 100.0
        outputValue = result.toString()
    }

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

        // Input Value Field
        OutlinedTextField(value = inputValue, onValueChange = {
            inputValue = it
            convertUnits()
        }, label = { Text("Enter Value") })

        Spacer(modifier = Modifier.height(16.dp))

        // Unit Selection Row
        Row {
            // Input Unit Dropdown
            Box {
                Button(onClick = { iExpanded = true }) {
                    Text(text = inputUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = iExpanded, onDismissRequest = { iExpanded = false }) {
                    DropdownMenuItem(text = { Text("Centimeters") }, onClick = {
                        iExpanded = false
                        inputUnit = "Centimeters"
                        conversionFactor.value = 0.01
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text("Meters") }, onClick = {
                        iExpanded = false
                        inputUnit = "Meters"
                        conversionFactor.value = 1.0
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text("Feet") }, onClick = {
                        iExpanded = false
                        inputUnit = "Feet"
                        conversionFactor.value = 0.3048
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text("Millimeters") }, onClick = {
                        iExpanded = false
                        inputUnit = "Millimeters"
                        conversionFactor.value = 0.001
                        convertUnits()
                    })
                }
            }

            Spacer(modifier = Modifier.width(16.dp))

            // Output Unit Dropdown
            Box {
                Button(onClick = { oExpanded = true }) {
                    Text(text = outputUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = oExpanded, onDismissRequest = { oExpanded = false }) {
                    DropdownMenuItem(text = { Text("Centimeters") }, onClick = {
                        oExpanded = false
                        outputUnit = "Centimeters"
                        oconversionFactor.value = 0.01
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text("Meters") }, onClick = {
                        oExpanded = false
                        outputUnit = "Meters"
                        oconversionFactor.value = 1.0
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text("Feet") }, onClick = {
                        oExpanded = false
                        outputUnit = "Feet"
                        oconversionFactor.value = 0.3048
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text("Millimeters") }, onClick = {
                        oExpanded = false
                        outputUnit = "Millimeters"
                        oconversionFactor.value = 0.001
                        convertUnits()
                    })
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Output Result Text
        Text("Result: $outputValue $outputUnit")
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

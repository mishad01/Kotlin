package com.example.a5_functions_objects_coffee_machine
data class CoffeeDetails(
    val sugarCount :Int,
    val name : String,
    val size:String,
    val creamAmount : Int
)


fun main(){
    println("Hello World")
    val coffee = CoffeeDetails(0,"Denis","XXL",3);
    makeCoffee(coffee)

}
fun makeCoffee(CoffeeDetails: CoffeeDetails) {

    println("Making a ${CoffeeDetails.size} ${CoffeeDetails.name} coffee with:")
    println("- ${CoffeeDetails.sugarCount} sugar(s)")
    println("- ${CoffeeDetails.creamAmount} cream portion(s)")
}
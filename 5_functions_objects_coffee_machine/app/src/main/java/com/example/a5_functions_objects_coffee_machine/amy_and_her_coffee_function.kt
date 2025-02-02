package com.example.a5_functions_objects_coffee_machine

fun main(){
    makeCoffee()
    test(5)
    nameAge("Mishad",5);
    println("Add two number")
    val a  = readln().toInt();
    val b = readln().toInt();
    println(add(a,b))
    println(checkDouble(a,b))
}
fun add(num1:Int,num2:Int) :Int{
    var result = num1+num2;
    return result;
}
fun checkDouble(num1:Int,num2:Int) :Double{
    var result = num1/num2.toDouble();
    return result.toDouble();
}
fun makeCoffee(){
    println("Apple")
    println("Banana")
    println("Orange")
    println("Mango")
    println("Strawberry ")
}

fun test(count : Int){
    println("Print value of count $count");
}
fun nameAge(name:String,age:Int){
    println("My name is $name and age is $age")
}

fun addSugar(a : Int,b :Int): Int {
    return a+b
}
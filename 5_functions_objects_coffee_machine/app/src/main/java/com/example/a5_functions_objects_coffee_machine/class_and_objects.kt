package com.example.a5_functions_objects_coffee_machine

fun main(){

    //Creating an object/ instance of the class object
    var tommy = Dog("Tommy");
    tommy.bark();
    tommy.nameOfDog("Huhuhaha");


}


class Dog constructor(name:String){
    init {
        bark()
        nameOfDog(name)
    }
    fun nameOfDog(name:String){
        println("Dog name is $name")
    }
    fun bark(){
        println("Woof woof");
    }
}
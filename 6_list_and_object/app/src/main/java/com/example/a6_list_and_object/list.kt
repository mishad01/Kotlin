package com.example.a6_list_and_object

fun main(){
    //Immutable List
    // We cannot add or do anything with this list
    val shoppingList = listOf("A","B","C","D");
    println(shoppingList)

    //Mutable List

    val shoppingList2 = mutableListOf("A","B","C","D",1);
    shoppingList2.add("E");
    shoppingList2.add(10); //Add items
    println(shoppingList2)
    shoppingList2.removeAt(3) //Remove items
    shoppingList2.add(3,"Test") //Add Items on specific index
    println(shoppingList2)
    println(shoppingList2[3])
    shoppingList2.set(1,"Test 1")//Replace Items from particular index
    println(shoppingList2)
    println(shoppingList2.contains(1)) //Checks if item is present in list or not

    for (items in shoppingList2){
        print( "$items ");
    }
    println("------------")
    println("------------")
    for(i in 0 until 3){
        println(shoppingList2[i]);
    }

}
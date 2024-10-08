fun main(){
    //.........VAL Immutable........//
     /*Trying to modify `name` will cause an error
     name = "Rahman" Error: Val cannot be reassigned*/
    val name = "Sakif"  // Immutable, can't be changed
    println(name)

    //.........VAR Mutable........//
    var age = 25 // Mutable, can be changed
    println(age)
    age = 67 // Changing the value of `age`
    println(age)  // Now prints 26

    /*val: Immutable (read-only) variable, once set, it cannot be changed.
    var: Mutable (can be reassigned), meaning you can modify the value after initialization.*/

}
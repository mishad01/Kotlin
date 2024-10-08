fun main(){
    val name: String? = "Kotlin"  // Nullable type
    val age: Int? = null          // Valid, since it's a nullable type

    //Null Check
    var leng = 0;

    val nullableName: String? = "SomeName"

    if (nullableName != null) {
        leng = nullableName.length  // Reassign leng
    } else {
        leng = 0  // Reassign leng if nullableName is null
    }

    println(leng)




    // a. Safe Call (?.)
    println(name?.length)  // Prints: null, doesn't throw an exception

    //b. Elvis Operator (?:)
    val length = name?.length ?: 0  // If `name` is null, it returns 0
    println(length)  // Prints: 0

    //c. Non-null Assertion (!!)
    println(name!!.length)  // Works fine since `name` is not null

    //4. Safe Casting (as?)
    val obj: Any = "Kotlin"
    val str: String? = obj as? String  // Safe casting
    println(str)  // Prints: Kotlin

    //5. let Function
    name?.let {
        println(it.length)  // Executes this block only if `name` is not null
    }

    //6. lateinit and by lazy
    lateinit var name1: String  // Must be initialized before use
    name1 = "Kotlin"
    println(name1)  // Prints: Kotlin

    val name2: String by lazy {
        "Kotlin"  // Initialized only when accessed for the first time
    }
    println(name2)  // Prints: Kotlin

//    7. Nullable Collections
    val numbers: List<Int?> = listOf(1, 2, null, 4)




}
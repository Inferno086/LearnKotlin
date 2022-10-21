/*These functions are outside any class
* These are top level functions*/

fun greeting(s : String?) : String
{
    return "$s is the given string"
}

fun hello1() : String
{
    return "Hello"
}

fun hello() = "Hello"

// Both hello() and hello1() are the same

fun getGreeting() : Unit {
    println(hello())
}

fun sayHello(greeting : String, item : String) = println("$greeting $item")

fun main()
{
    println(greeting("Arjun"))
    println(greeting("Aman"))
    println(greeting("Dhwaj"))
    println(greeting("Pragyasheel"))
    println(greeting("Akshat"))
    println(greeting(null))
    getGreeting()

    sayHello("Hey", "Kotlin")
}
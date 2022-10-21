fun greetPerson(greeting : String = "Hey", name : String = "Kotlin") = println("$greeting $name")

fun main()
{
    // We can change the order of arguments using this format
    greetPerson()
    greetPerson(name = "Arjun", greeting = "Hello")

    val names1 = arrayOf("Dhwaj", "Pragyasheel", "Aman")
    names1.forEach { s ->
        greetPerson(greeting = "Hello", s)
    }
}
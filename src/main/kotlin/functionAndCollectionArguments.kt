fun sayHello(greeting : String, itemsToGreet : List<String>)
{
    itemsToGreet.forEach{ s ->
        println("$greeting $s")
    }
}

fun main()
{
    val names = listOf("Arjun", "Pragyasheel", "Dhwaj", "Aman")

    sayHello("Hello", names)
}
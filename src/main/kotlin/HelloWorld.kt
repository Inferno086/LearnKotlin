var name : String? = "Dhwaj"

fun main()
{
    when(name)
    {
        null -> println("It is null")
        "Arjun" -> println("It is Arjun")
        "Pragyasheel" -> println("It is Pragyasheel")
        else -> println("It matches nothing")
    }
}

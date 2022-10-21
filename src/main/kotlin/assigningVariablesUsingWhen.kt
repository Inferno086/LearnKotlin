var greeting : String? = null
fun main()
{
    greeting = "Aman"
    val name = when(greeting) {
        null -> "Hi"
        else -> greeting
    }
    println(name)
}
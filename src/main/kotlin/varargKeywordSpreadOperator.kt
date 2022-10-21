fun sayHello1(greeting : String, vararg itemsToGreet :String)
{
    itemsToGreet.forEach{ s ->
        println("$greeting $s")
    }
}

fun sumOfNumbers(vararg nums : Int) : Int
{
    var sum = 0
    nums.forEach{x ->
        sum += x
    }
    return sum
}

fun main()
{
    val names = listOf("Arjun", "Pragyasheel", "Dhwaj", "Aman")

//    sayHello1("Hello", *names)   This does not work with list

    sayHello1("Hey", "N1", "N2", "N3", "N4")


    val names1 = arrayOf("Arjun", "Pragyasheel", "Dhwaj", "Aman")

    sayHello1(greeting = "Hello", itemsToGreet = *names1)

    // * is spread operator

    var numbers = intArrayOf(1,4,3,2,6,4,7,4)

    println(sumOfNumbers(1,2,3,4,5,6,7,8))
    println(sumOfNumbers(*numbers))

}
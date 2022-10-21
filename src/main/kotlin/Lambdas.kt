import kotlin.math.pow

fun main()
{
    var fn: (a: Double, b: Double) -> Double = ::sum   // type can be omitted, :: is used

    println(fn(3.5, 4.5))

    // Higher Order Function

    print("4^2 = ")
    calculator(4.0, 2.0, ::power)

    // Lambda Functions

    val lambda1 = {x : Int, y : Int -> x + y}

    val lambda2 = {x : Int, y : Int ->
        println("This is lambda2 function")
        val a = x * y
        a      // The last value is returned
    }

    println(lambda2(5, 4))

    calculator(4.3, 5.2, {a, b -> a * b})
}

fun sum(a : Double, b : Double) : Double = a + b

fun power(a : Double, b : Double) : Double = a.pow(b)

// Storing function in a variable
// In kotlin, we can use a function just like we use classes
// We can store a function in a variable


// Higher Order Function which take function as parameter

fun calculator(a : Double, b : Double, gn : (Double, Double) -> Double)
{
    val result = gn(a, b)
    println(result)
}
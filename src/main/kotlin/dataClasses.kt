// Data classes are special classes which are used to store
// In Kotlin, data keyword is used to make data classes
/* obj1 == obj2 will return true if obj1, obj2 are objects of a data class
   and have the same data.
   If data keyword is not used, obj1 == obj2 will return false.*/

fun main()
{
    // Non data class

    val obj1 = Z(1,2)
    val obj2 = Z(1,2)
    // Both contain same data

    println(obj1)
    println(obj2)
    println(obj1.hashCode())
    println(obj1 == obj2)

    println()

    // Data Class

    val obj3 = K(1,2)
    val obj4 = K(1,2)
    // Both contain same data

    println(obj3)
    println(obj4)
    println(obj3.hashCode())
    println(obj3 == obj4)
}

class Z(val x : Int, val y : Int)
{

}

data class K(val x : Int, val y : Int)
{

}
// By using object keyword, class and its single object are created at once
// It cannot have more than one object
// No constructors are allowed, init block is allowed
// We can inherit class or interface
// Using object keyword, we can make objects without making any class

fun main()
{
    println(A.num)
    println(B.p)
    B.test()

    var testObj = object : Cloneable {
        val x = 10
        fun method() = println("I am object expression, x = $x")
        override fun clone() = println("Made clone")
    }
}

private object A
{
    val num = 10
}

object B
{
    val p = 20
    fun test() = println("I am object B")
}

interface Cloneable
{
    fun clone()
}
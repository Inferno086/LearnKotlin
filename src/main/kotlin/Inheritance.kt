open class Parent(s : String = "Arjun")
{
    var name : String

    fun myMethod()
    {
        println("I am in Parent")
    }

    fun printName()
    {
        println("The name is $name")
    }

    init
    {
        name = s
        println("Parent constructor is called")
    }
}

// Child class can only have one parent class

class Child(s1 : String, s2 : String = "Arjun") : Parent(s1)
{
    val name2 : String

    init
    {
        name2 = s2
        println("Child constructor is called")
    }

    fun myMethod2()
    {
        super.myMethod()
        println("I am in Child")
    }

    fun printName2()
    {
        println("The name is $name2")
    }
}

fun main()
{
    val objChild = Child("Pragyasheel", "Dhwaj")
    objChild.myMethod()
    println(objChild.name)
    objChild.myMethod2()
    println(objChild.name2)
    objChild.printName()
    objChild.printName2()
}
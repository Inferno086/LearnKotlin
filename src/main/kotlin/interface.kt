// Interface helps us in grouping classes based on their behavior
// An interface works similar to an abstract class
// A class can inherit from more than one interface
// Interface functions have to implemented in every class which inherits it

fun main()
{
    dragObjects(arrayOf(Square2(3.0), Circle2(2.0), Triangle2(3.0, 2.0), Player("Arjun")))
}

// We can pass object of Shape2, Circle2, Square2, Triangle2 and Player2 in Array<Draggable>
// This is polymorphism in kotlin

fun dragObjects(objects : Array<Draggable>)
{
    objects.forEach { obj ->
        obj.drag()
    }
}

interface Draggable
{
    fun drag()
}

// This Draggable interface contains drag(), which is inherited in Shape2 and Player class.

abstract class Shape2 : Draggable
{
    abstract fun area2() : Double
}

class Circle2(val radius : Double) : Shape2()
{
    override fun area2() : Double = Math.PI * radius * radius
    override fun drag() = println("Circle is dragging")
    fun roll() = println("Rolling")
}

class Square2(val side : Double) : Shape2()
{
    override fun area2() : Double = side * side
    override fun drag() = println("Square is dragging")
}

class Triangle2(val base : Double, val height : Double) : Shape2()
{
    override fun area2() : Double = 0.5 * base * height
    override fun drag() = println("Triangle is dragging")
}

class Player(val name : String) : Draggable
{
    override fun drag() = println("$name is dragging")
    fun giveName() = println("Name is $name")
}
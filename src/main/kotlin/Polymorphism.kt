fun main()
{
    val obj1 : Circle = Circle(4.1)
    val obj2 : Shape = Circle(4.1)
    // These both do the same
    obj1.roll()
    obj2.roll()

    // Array<Shape> can hold object of Circle and Square. This is polymorphism
    // This is done at compile time

    val shapes : Array<Shape> = arrayOf(Circle(3.0),Square(2.0), Circle(5.0), Square(4.0))
    calculateArea(shapes)
    println()

    // If object of Parent class is required, we can also pass object of child class
    // If area() was not in Circle, it would have called area() of Shape
    // But we cannot pass Parent object where a child object is required
    val obj3 = Shape()
    val obj4 = Square(4.0)
    printArea(obj3)
    printArea(obj4)
}

fun calculateArea(shapes : Array<Shape>)
{
    for(shape in shapes)
    {
        println(shape.area())
    }
}

fun printArea(obj : Shape)
{
    println(obj.area())
}

open class Shape
{
    open fun area() : Double
    {
        return 0.0
    }

    fun roll(){}
}

class Circle(val radius : Double) : Shape()
{
    override fun area() : Double
    {
        return Math.PI * radius * radius
    }
}

class Square(val side : Double) : Shape()
{
    override fun area() : Double
    {
        return side * side
    }
}
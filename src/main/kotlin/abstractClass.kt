fun calculateArea1(shapes : Array<Shape>)
{
    for(shape in shapes)
    {
        println(shape.area())
    }
}

fun printArea1(obj : Shape)
{
    println(obj.area())
}

// An abstract method is a method which will be defined in the child class
// An abstract method can only be described in an abstract class
// We cannot create an instance of an abstract class
// Every abstract method in an abstract class must be overridden in a child class

abstract class Shape1
{
    abstract fun area1() : Double

    fun roll(){}
}

class Circle1(val radius : Double) : Shape1()
{
    override fun area1() : Double
    {
        return Math.PI * radius * radius
    }
}

class Square1(val side : Double) : Shape1()
{
    override fun area1() : Double
    {
        return side * side
    }
}
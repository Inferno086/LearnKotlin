/*
A companion object is not inheritable. But it can inherit from another class or
implement interfaces. This is one of the reasons that a companion object is
similar to static declarations in Java and C#
*/

fun main()
{
    // We can use functions of companion objects directly
    Car.roll()

//    Maruti.Wheel.roll() -  Not allowed as object Wheel belongs only to Car class
    val car1 : Car = Maruti(40)
    car1.run()
    car1.roll()
}

abstract class Car
{
    abstract val capacity : Int
    abstract fun roll()

    companion object Wheel : Car(){
        override val capacity = 0
        override fun roll() = println("Wheel is Rolling!")
    }

    fun run() = println("Car is running!")
}

class Maruti(_capacity : Int) : Car()
{
    override val capacity: Int = _capacity
    override fun roll() = println("Maruti is rolling!")
}
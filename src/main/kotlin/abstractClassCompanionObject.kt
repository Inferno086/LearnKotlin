fun main()
{
    // We can use functions of companion objects directly
    Car.roll()

//    Maruti.Wheel.roll() -  Not allowed as object Wheel belongs only to Car class
    val car1 : Car = Maruti(40)
    car1.run()
}

abstract class Car
{
    abstract val capacity : Int

    companion object Wheel{
        fun roll() = println("Wheel is Rolling!")
    }

    fun run() = println("Car is running!")
}

class Maruti(_capacity : Int) : Car()
{
    override val capacity: Int = _capacity
}
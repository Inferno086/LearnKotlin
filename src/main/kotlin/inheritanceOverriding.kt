open class Mobile
{
    open val name = ""
    open val size = 5
    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting down")
    open fun display() = println("Simple mobile display")
}

/* open keyword is used to make a class possible to inherit
   and it makes a method or property to allow overriding*/
// override keyword is used while overriding a method etc

class OnePlus : Mobile()
{
    override val name = "One Plus"
    override val size = 6
    override fun display() = println("One Plus Display")

    fun volume() = println("Volume is 10")
}

fun main()
{
    val objMobile = Mobile()
    val objOnePlus = OnePlus()
    objMobile.display()
    objOnePlus.display()
    objOnePlus.powerOff()
}
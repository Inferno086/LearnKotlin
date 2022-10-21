interface EmployeeInfoProvider
{
    val providerInfo : String
    fun printInfo(person : Employee)
    {
        println(providerInfo)
        person.getInfo()
    }
}

interface SessionInfoProvider
{
    fun getSessionInfo()
}

class BasicInfoProvider : EmployeeInfoProvider, SessionInfoProvider
{
    override val providerInfo: String
        get()
        {
            return "BasicInfoProvider"
        }

    override fun getSessionInfo() {
        println("SessionInfoProvider Implementation of getSessionInfo()")
    }
}

fun main()
{
    val b1 = BasicInfoProvider()
    b1.printInfo(Employee(_salary = 5.5))
    b1.getSessionInfo()
    checkTypes(b1)
}

fun checkTypes(b : BasicInfoProvider)
{
    if(b is SessionInfoProvider)
    {
        println("This is a session info provider")
    }
    else
    {
        println("It is not a session info provider")
        (b as SessionInfoProvider).getSessionInfo()  //Casting - It is not necessary in Kotlin
    }
}
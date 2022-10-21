open class Employee(_first : String = "Peter", _last : String = "Griffin", _salary : Double)
{
    protected var firstname : String
    protected var lastname : String
    private var age : Int? = null
    protected var salary : Double? = null

    init
    {
        firstname = _first
        lastname = _last
        salary = _salary
    }

    fun setAge(_age : Int?)
    {
        age = _age
    }

    fun getAge()
    {
        val ageToPrint = age ?: "no age given"
        println("The age of $firstname $lastname is $ageToPrint")
    }

    open fun getInfo()
    {
        val salaryToPrint = salary ?: "No salary found!"
        val ageToPrint = age ?: "No age found!"
        println("The name of the employee is : $firstname $lastname")
        println("The age of the employee is : $ageToPrint")
        println("The salary of the employee is : $salaryToPrint")
    }
}

class GoogleEmployee(gID : Int = 0, first : String = "Arjun", last : String = "Shukla", sal : Double) : Employee(_first = first, _last = last ,_salary = sal)
{
    private val googleID : Int = gID

    override fun getInfo()
    {
        val salaryToPrint = salary ?: "No salary found!"
        println("The name of the employee is : $firstname $lastname")
        println("The salary of the employee is : $salaryToPrint")
        println("The Google ID of the employee is : $googleID")
    }
}

fun main()
{
    val emp = GoogleEmployee(gID = 12345 ,sal = 4.0)
    emp.getInfo()
}
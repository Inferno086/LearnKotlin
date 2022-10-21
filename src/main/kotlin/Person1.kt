public class Person1(val firstname : String = "Peter", val lastname : String = "Griffin")
{
    // This is how we update getters and setters in kotlin
    // Kotlin gives getters and setters to variables by default
     var nickName : String? = null
        set(value){
            field = value
            println("The new nickname is $field")
        }
        get(){
//            return "The nickname is $field"
            return field
        }

    private var age : Int? = null

    fun setAge(Age : Int)
    {
        age = Age
    }

    fun getAge()
    {
        println("The age is $age")
    }

    fun getInfo()
    {
//        val nicknameToPrint = if(nickName != null) nickName else "no nickname"
        val nicknameToPrint = nickName ?: "no nickname" //Elvis operator
        val ageToPrint = age ?: "no age given"
        println("$firstname ($nicknameToPrint) $lastname (age = $ageToPrint)")
    }

//    init
//    {
//        print("$firstname $lastname\n")
//    }
}
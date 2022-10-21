fun main()
{
    MyClass.MyObject.f()
//    MyClass.f()      Doesn't work
    MyClass.AnotherObject.g()
    MyClass.g()
}

// Only one companion object is allowed per class
class MyClass
{
    object MyObject
    {
        fun f() = println("Hello I am F from MyObject")
    }

    companion object AnotherObject
    {
        @JvmStatic
        fun g() = println("Hello I am G from AnotherObject")
    }
}
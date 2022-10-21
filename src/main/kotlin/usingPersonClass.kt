fun main()
{
//    val p1 = Person("Arjun1", "Shukla")
//    println(p1.firstname)
    // Secondary constructor runs when no arguments are given to primary constructor
    // init blocks run before secondary constructor

    val p2 = Person1("Dhwaj", "Sharma")
    p2.nickName = "Nannan"
//    println(p2.nickName)

    p2.getInfo()
    p2.setAge(45)
    p2.getInfo()


//    val p3 = Person1()
}
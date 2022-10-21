// is operator is used for type checking
// Kotlin can smart-cast whenever possible
// If kotlin cannot smart-cast, we typecast manually
// as operator is used for casting
// We can easily cast Parent object as a child

fun main()
{
    val cir = Circle2(3.0)
    val pla = Player("Arjun")
    val arr : Array<Draggable> = arrayOf(cir, pla)

    arr.forEach { obj ->
        if(obj is Circle2)
        {
            obj.roll()
        }
        else
        {
            (obj as Player).giveName()
        }
    }
}

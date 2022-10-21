class Person(_first : String, _last : String)
{
    var firstname : String
    var lastname : String

    init
    {
        println("Init 1")
        firstname = _first
        lastname = _last
    }

    constructor() : this("Arjun", "Shukla"){
        println("Secondary constructor")
    }

    init{
        println("Init 2")
    }
}
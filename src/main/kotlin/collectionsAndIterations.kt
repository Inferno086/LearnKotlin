fun main()
{
    val languages = arrayOf("Kotlin", "Java", "Python", "C", "C++")
    println(languages.size)
    println(languages[0])
    println(languages[1])
    println(languages[2])
    println(languages[3])
    println(languages[4])
    println(languages.get(0))
    println(languages.get(1))
    println(languages.get(2))
    println(languages.get(3))
    println(languages.get(4))

    println()

    for(language in languages)
    {
        println(language)
    }

    println()

    languages.forEach {
        println(it)
    }

    println()

    languages.forEach {language ->
        println(language)
    }

    println()

    languages.forEachIndexed { index, s ->
        println("$s is at index $index")
    }

    println()

    val countries = listOf("India", "Japan")
    countries.forEachIndexed { index, s ->
        val i = index + 1
        println("$i) $s")
    }

    println()

    val map = mapOf(1 to "Japan", 2 to "India", 3 to "China")

    map.forEach {key , value -> println("$key) $value") }

    println()

//    By default, lists and maps are immutable, i.e., they cannot be changed
    val languages1 = mutableListOf("Kotlin", "Java", "Python", "C", "C++")
    languages1.add("Javascript")

    languages1.forEachIndexed{index, language -> println("$index -> $language")
    }

    println()

    val map1 = mutableMapOf(1 to "Japan", 2 to "India", 3 to "China")
    map1.put(4, "Pakistan")

    map1.forEach {key , value -> println("$key) $value") }

    println()


}
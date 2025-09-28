package man

import java.io.File
import java.util.*

fun main(args: Array<String>) {
    var male = Male("MARCO")
    male.eat()

    var female = Female("Candy")
    female.eat()

    var female2 = Female("Upton")
    var male2 = Male("JAMES")

    println("===========")
    var list = listOf<Human>(male, female, male2, female2)
    for (l in list) {
        l.eat()
    }

    println("===========")
    for (l in list) {
        // Only Male to excise
        if (l is Male) {
            with(l) {
                eat()
                excising()
            }
//            l.eat()
//            l.excising()
        }
        // Only Female to markup
        if (l is Female) {
            l.eat()
            l.makeuping()
        }
    }

    println("===========")
    val fruits = listOf("apple", "banana", "peach", "blackberry", "blueberry")
    when {
        "banana" in fruits -> println("There is a banana")
        "orange" in fruits -> println("There is an orange")
    }
    fruits
        .filter { it.startsWith("b") }
        .sortedBy { it }
        .map { it.uppercase(Locale.getDefault()) }
        .forEach{ println(it) }

    println("===========")
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    for ((k, v) in map) {
        println("$k -> $v")
    }

    for (i in 1..5) {
        print("$i ")
    }
    println()

    for (i in 1 until 5) {
        print("$i ")
    }
    println()

    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()

    val files = File("/tmp/test/").listFiles()
    println(files?.size)
    println(files?.size ?: "empty")

    val data = mapOf<String, String>("username" to "Marco", "email" to "xxx@qq.com")
    val email = data["email"] ?: throw IllegalStateException("Email is missing")
    println("Email: $email")

    data?.let {
        println("$data is not empty")
    }

    println("Color Value is " + transform("Green"))
    println("testIf(2) is " + testIf(2))
    println(theNum())
    num = 100
    println(theNum())

    val asc = Array(5, {i -> (i * i).toString()})
    for (a in asc) {
        print(a + " ")
    }
    println("===========")

    val intArray: IntArray = intArrayOf(5, 6, 7, 8)
    println("${intArray[0]}, ${intArray[1]}, ${intArray[2]}, ${intArray[3]}")

    val s = """
        Hello String.
        Hi String.  
        Dear String.
    """.trimIndent()
    println("$s")
}

fun transform(color: String): Int {
    return when(color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
//        else -> throw IllegalArgumentException("Invalid color parameter value")
        else -> -1
    }
}

fun testIf(param: Int): String {
    val result = if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else {
        "three"
    }
    return result
}

var num = 20
fun theNum() = num
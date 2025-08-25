import java.lang.Exception
import kotlin.math.PI

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    println("5+8=" + add(5, 8))
    println("Total ${lengthOfString("ABCDE")} characters")

    println("String test:")
    println("${white("board")}")
    println("${white("cup")}")
//    println("${white(null)}")

    println("Your score is ${grade(9)}")

    loopTest()

    println("${rectangleArea(5, 6)}")
    println("${circleArea(3.0, 2.0)}")
    println("${circleArea(radius = 2.0)}")

    readFromShell()
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun lengthOfString(arg: String): Int {
    return arg.length
}

fun white(arg: String): String {
    return "White $arg"
}

fun grade(score: Int) : String {
    when (score) {
        10 -> {
            println("PERFECT")
            return "PERFECT"
        }
        9 -> {
            println("GREAT")
            return "PERFECT"
        }
        8 -> {
            return "GOOD"
        }
        7 -> {
            return "OK"
        }
        else -> return "TOO BAD"
    }
}

fun loopTest() {
    var nums = 1 .. 10
    for (num in nums) {
        println(num)
    }
    println("=====")

    var nums2 = 3 until 10
    for (num in nums2 step 2) {
        println(num)
    }
    println("=====")

    var nums3 = nums2.reversed()
    for (num in nums3) {
        println(num)
    }
}

/*
 * Default argument START
 */
fun rectangleArea(length: Int, width: Int): Int {
    return length * width
}

fun circleArea(pi: Double = PI, radius: Double): Double {
    return pi * radius * radius
}
/*
 * Default argument END
 */

/*
 * Input from shell
 */
fun readFromShell() {
    println("readFromShell, plus calculator.")
    println("Input num1Str:")
    var num1Str = readLine()
    println("Input num2Str:")
    var num2Str = readLine()

    try {
        var num1: Int = num1Str!!.toInt()
        var num2: Int = num2Str!!.toInt()
        println("${num1} + ${num2} = ${num1 + num2}")
    } catch (e: Exception) {
        println("Input parameter is not number, please retry.")
    }
}
fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    println("sum(3, 8) = " + sum(3, 8))
    println("sum2(5, 12) = " + sum2(5, 12))
    test0()
}

fun sum(a: Int, b: Int) : Int {
    println("sum()")
    return a + b
}

fun sum2(a: Int, b: Int) = a + b + 1

fun test0() {
    var a = 5
    println("a=$a")
}

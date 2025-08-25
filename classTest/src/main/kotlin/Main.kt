class Rect(var length: Int, var width: Int, var color: String) {
    fun area(): Int {
        return length * width
    }

    fun color(): String {
        return color
    }
}

fun main(args: Array<String>) {
    var rect = Rect(3, 5, "yellow")
    println("${rect.length}, ${rect.width}")
    println(rect.area())
    println(rect.color())

    var tv = Tv()
    println("State=${tv.getState()}")
    tv.open()
    println("State=${tv.getState()}")
    tv.replayMusic()
    println("State=${tv.getState()}")
    tv.replayVideo()
    println("State=${tv.getState()}")
    tv.close()
    println("State=${tv.getState()}")

    var computer = Computer()
    println(computer.getName())
    computer.setName("COMPUTER1")
    println(computer.getName())

    var laptop = Laptop()
    println(laptop.dedicatedKeyboard())
}
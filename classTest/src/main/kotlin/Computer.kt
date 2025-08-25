open class Computer {
    private var name = "COMPUTER"
    private var displaySize = "20"

    open fun setName(n: String) {
        name = n
    }

    open fun getName(): String {
        return name
    }

    open fun dedicatedKeyboard(): Boolean {
        return true
    }

    fun displaySize(): String {
        return displaySize
    }
}
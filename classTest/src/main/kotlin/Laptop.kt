class Laptop: Computer() {
    private var name: String = "LAPTOP"

    override fun setName(n: String) {
        name = n
    }

    override fun getName(): String {
        return name
    }

    override fun dedicatedKeyboard(): Boolean {
        return false
    }
}
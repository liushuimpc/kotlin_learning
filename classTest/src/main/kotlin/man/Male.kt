package man

class Male(name: String): Human(name), Excise {
    override fun eat() {
        println("${name} is eating quickly")
    }

    override fun excising() {
        println("${name} is doing excise")
    }
}
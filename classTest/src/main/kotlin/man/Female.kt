package man

class Female(name: String): Human(name), Makeup {
    override fun eat() {
        println("${name} is eating slowly")
    }

    override fun makeuping() {
        println("${name} is markuping")
    }
}
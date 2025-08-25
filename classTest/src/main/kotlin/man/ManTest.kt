package man

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
            l.eat()
            l.excising()
        }
        // Only Female to markup
        if (l is Female) {
            l.eat()
            l.makeuping()
        }
    }
}

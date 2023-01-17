fun main() {
    // todo: Erstelle hier deinen Code.
    var list1: MutableList <Int> = mutableListOf(4, 8, 3)
    var list2: MutableList <Int> = mutableListOf(2, 4, 9)

    list1.add(3)
    list2.add(6)

    list1[list1.size -1]
    list2[list2.size -1]
    var summe: Int = list1[list1.size -1] + list2[list2.size -1]
    println(summe)

    /*list1[3]
    list2[3]
    var summe: Int = list1[3] + list2[3]
    println(summe) */

}
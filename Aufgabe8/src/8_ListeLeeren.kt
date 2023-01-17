fun main() {
    val wochentage: MutableList<String> = mutableListOf("Montag", "Dienstag", "Mittwoch")
    // todo: Erweitere ab hier den Code.
    wochentage.add("Donnerstag")
    wochentage.add("Freitag")
    wochentage.add("Samstag")
    wochentage.add("Sonntag")

    println(wochentage.size)
    wochentage.clear()

    println(wochentage)
    // 0
    //println(wochentage.clear())

}
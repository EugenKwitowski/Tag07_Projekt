fun main() {
    val a: List<Double> = listOf(2.3, 5.4, 6.8)
    val b: Double = a.min()

    var ware: MutableList<String> = mutableListOf("Schokolade", "Wassereis", "Zeitung")
    var price: MutableList<Double> = mutableListOf( 1.29, 0.49, 1.99 )

    println("${ware[0]} = ${price[0]}")
    println("${ware[1]} = ${price[1]}")
    println("${ware[2]} = ${price[2]}")

    val wunschWare = readln()

    var index = ware.indexOf(wunschWare)
    var angefragterPrice = price[index]

    println(angefragterPrice)

    ware.add(0,"Kaugummi")
    price.add(0,0.19)

    var peterGeld = 20
    var kaugummiPrice = 10 * 0.19
    var wasserEisPrice = 5 * 0.49
    var schockeRiegelPrice = 3 * 1.99
    println(peterGeld - kaugummiPrice - wasserEisPrice - schockeRiegelPrice)

    ware.removeAt(2)
    price.removeAt(2)
    var kleinsterPrice = price.min()
    println("Güntigster Artikel" + ware[price.indexOf(kleinsterPrice)])

}
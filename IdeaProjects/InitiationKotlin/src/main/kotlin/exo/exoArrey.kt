fun main() {
    val nombreEntier = 6
    val tableauEntier = IntArray(nombreEntier)

    for (i in 0 until nombreEntier) {
        print("Entrez un entier : ")
        tableauEntier[i] = readLine()!!.toInt()
    }

    val somme = tableauEntier.sum()



    println("La somme des entiers est : $somme")
}

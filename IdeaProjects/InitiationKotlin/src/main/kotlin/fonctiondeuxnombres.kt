fun additionnerDeuxNombresEntiers() {
    println("Entrez le premier nombre entier :")
    val premierNombre = readLine()?.toInt()

    println("Entrez le deuxième nombre entier :")
    val deuxiemeNombre = readLine()?.toInt()

    if (premierNombre != null && deuxiemeNombre != null) {
        val somme = premierNombre + deuxiemeNombre
        println("La somme de $premierNombre et $deuxiemeNombre est : $somme")
    } else {
        println("Saisie invalide. Veuillez entrer deux nombres entiers valides.")
    }
}

fun main() {
    additionnerDeuxNombresEntiers()
}

fun main() {

    var nombre: Int

    do {

        print("Veuillez entrer un nombre positif : ")

        val input = readLine()

        nombre = input?.toIntOrNull() ?: -1 // Utilise -1 si la conversion échoue

    } while (nombre <= 0)



    println("Vous avez saisi un nombre positif : $nombre")

}



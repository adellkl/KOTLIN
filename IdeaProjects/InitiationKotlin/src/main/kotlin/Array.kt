fun main(args: Array<String>) {

    // Try adding program arguments via Run/Debug configuration.

    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

    println("Program arguments: ${args.joinToString()}")



    val tableauEntiers: Array<Int> = arrayOf(10, 20, 30, 40, 50)



    for (i in tableauEntiers.indices) {

        println("Élément $i : ${tableauEntiers[i]}")

    }



}
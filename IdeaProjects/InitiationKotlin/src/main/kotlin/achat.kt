import java.util.Scanner

fun main() {


    println("Entrez le nombre d'article ")

    val scanner = Scanner(System.`in`)

    println("Combien d'articles avez-vous achetés ?")
    val nombreArticles = scanner.nextInt()

    var totalPrix = 0.0

    for (i in 1..nombreArticles) {
        println("Veuillez entrer le prix de l'article $i :")
        val prixArticle = scanner.nextDouble()
        totalPrix += prixArticle
    }

    println("Le total des achats est de : $totalPrix €")

    if (totalPrix >= 50.0) {
        println("Félicitations ! La livraison est gratuite.")
    } else {
        println("La livraison n'est pas gratuite. Les frais de livraison s'appliquent.")
    }
}
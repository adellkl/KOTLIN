const val MONTANT_MAX_POUR_LIVRAISON_GRATUITE: Float = 50f

fun main() {
    var montantTotal = 0.0

    println("Bienvenue dans votre panier électronique!")

    do {
        println("Entrez le prix de l'article (un nombre négatif pour terminer):")
        val input = readLine()

        if (input == null) {
            println("Entrée invalide. Veuillez entrer un nombre valide.")
            continue
        }

        val prixArticle = input.toDoubleOrNull()

        if (prixArticle == null) {
            println("Prix invalide. Veuillez entrer un nombre valide.")
            continue
        }

        if (prixArticle < 0.0) {
            break
        }

        montantTotal += prixArticle
        println("Article ajouté au panier. Montant total actuel : $montantTotal")

        if (montantTotal >= MONTANT_MAX_POUR_LIVRAISON_GRATUITE) {
            println("Votre montant d'achat est supérieur ou égal à 50 Euros, donc la livraison est gratuite.")
        } else {
            val montantRestant = MONTANT_MAX_POUR_LIVRAISON_GRATUITE - montantTotal
            println("Il vous manque encore $montantRestant pour bénéficier de la livraison gratuite.")
        }
    } while (true)

    println("Montant total du panier : $montantTotal")
    println("Merci d'avoir utilisé le panier électronique!")
}

/**
 * Classe Magazine, hérite de Media avec en plus un numéro
 * Emprunt et retour impossible
 */
class Magazine : Media {
    // Attributs
    private var numero: String = ""
    // Constructeur
    constructor(titre: String, dateDeParution: String, numero: String) : super(titre, dateDeParution) {
        this.numero = numero
    }
    // méthode d'affichage
    override fun afficher() {
        println("- Magazine: Titre = '$titre', Date de parution = '$dateDeParution', Numéro = '$numero'")
    }
    // méthode de consultation
    override fun consulter(): Boolean {
        // Vérification de la disponibilité
        if (!estEmprunte) {
            println("Le magazine '$titre' ($dateDeParution) numéro $numero est consulté sur place.")
            return true
        } else {
            println("Le magazine '$titre' est emprunté et ne peut donc pas être consulté pour l'instant.")
            return false
        }
    }
}
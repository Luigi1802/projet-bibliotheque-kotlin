/**
 * Classe Journal, hérite de Media avec en plus une frequence de parution
 * Emprunt et retour impossible
 */
class Journal : Media {
    // Attributs
    private var frequenceParution: String = ""
    // Constructeur
    constructor(titre: String, dateDeParution: String, frequenceParution: String) : super(titre, dateDeParution) {
        this.frequenceParution = frequenceParution
    }
    // méthode d'affichage
    override fun afficher() {
        println("- Magazine: Titre = '$titre', Date de parution = '$dateDeParution', Fréquence de parution = '$frequenceParution'")
    }
    // méthode de consultation
    override fun consulter(): Boolean {
        // Vérification de la disponibilité
        if (!estEmprunte) {
            println("Le magazine '$titre' ($dateDeParution, parution $frequenceParution) est consulté sur place.")
            return true
        } else {
            println("Le magazine '$titre' est emprunté et ne peut donc pas être consulté pour l'instant.")
            return false
        }
    }
}
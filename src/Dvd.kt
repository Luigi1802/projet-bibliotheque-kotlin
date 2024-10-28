/**
 * Classe DVD, hérite de Media avec en plus une durée et un genre
 * Emprunt et retour possible
 * Durée attendue en secondes
 */
class Dvd : Media {
    // Attributs
    private var duree: Int = 0 // Durée attendue en secondes
    private var genre: String = ""
    // Constructeur
    constructor(titre: String, dateDeParution: String, duree: Int, genre: String) : super(titre, dateDeParution) {
        this.duree = duree
        this.genre = genre
    }
    // méthode d'affichage
    override fun afficher() {
        println("- DVD : Titre = '$titre', Date de parution = '$dateDeParution', Durée = ${afficherDuree(duree)}, Genre = '$genre'")
    }
    // méthode d'emprunt
    override fun emprunter(): Boolean {
        // Vérification de la disponibilité
        if (!estEmprunte) {
            estEmprunte = true
            println("Le DVD '$titre' a été emprunté.")
            return true
        } else {
            println("Le DVD '$titre' est déjà emprunté et ne peut pas être emprunté à nouveau pour l'instant.")
            return false
        }
    }
    // méthode de retour
    override fun retourner(): Boolean {
        // Vérification de l'emprunt
        if (estEmprunte) {
            estEmprunte = false
            println("Le DVD '$titre' a été retourné.")
            return true
        } else {
            println("Le DVD '$titre' n'est pas emprunté et ne peut donc pas être retourné.")
            return false
        }
    }
    // méthode de consultation
    override fun consulter(): Boolean {
        // Vérification de la disponibilité
        if (!estEmprunte) {
            println("Le DVD '$titre' ($dateDeParution) de ${afficherDuree(duree)} secondes (genre '$genre') est consulté sur place.")
            return true
        } else {
            println("Le DVD '$titre' est emprunté et ne peut donc pas être consulté pour l'instant.")
            return false
        }
    }
}
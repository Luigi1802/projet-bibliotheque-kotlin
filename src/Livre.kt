/**
 * Classe Livre, hérite de Media avec en plus un auteur et un editeur
 * Emprunt et retour possible
 */
class Livre : Media {
    // Attributs
    private var auteur: String = ""
    private var editeur: String = ""

    // Constructeur
    constructor(titre: String, dateDeParution: String, auteur: String, editeur: String) : super(titre, dateDeParution) {
        this.auteur = auteur
        this.editeur = editeur
    }
    // méthode d'affichage
    override fun afficher() {
        println("- Livre: Titre = '$titre', Date de parution = '$dateDeParution', Auteur = '$auteur', Éditeur = '$editeur'")
    }

    // méthode d'emprunt
    override fun emprunter(): Boolean {
        // Vérification de la disponibilité
        if (!estEmprunte) {
            estEmprunte = true
            println("Le livre '$titre' a été emprunté.")
            return true
        } else {
            println("Le livre '$titre' est déjà emprunté et ne peut pas être emprunté à nouveau pour l'instant.")
            return false
        }
    }

    // méthode de retour
    override fun retourner(): Boolean {
        // Vérification de l'emprunt
        if (estEmprunte) {
            estEmprunte = false
            println("Le livre '$titre' a été retourné.")
            return true
        } else {
            println("Le livre '$titre' n'est pas emprunté et ne peut donc pas être retourné.")
            return false
        }
    }
    // méthode de consultation
    override fun consulter(): Boolean {
        // Vérification de la disponibilité
        if (!estEmprunte) {
            println("Le livre '$titre' ($dateDeParution) de $auteur (édition $editeur) est consulté sur place.")
            return true
        } else {
            println("Le livre '$titre' est emprunté et ne peut donc pas être consulté pour l'instant.")
            return false
        }
    }
}
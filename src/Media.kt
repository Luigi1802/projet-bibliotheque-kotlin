/**
 * Classe abstraite Media, implémentation des interfaces d'emprunt/retour et consultation
 * Attributs généraux à tous les types de Media : titre, date de parution et statut de l'emprunt (toujours à
 * false si le Media n'est pas empruntable)
 * Format de date attendu : ISO 8601 (YYYY-MM-DD)
 */
abstract class Media() : Empruntable, Consultable {
    // Attributs
    var titre: String = ""
    // Format de date attendu : ISO 8601 (YYYY-MM-DD)
    var dateDeParution: String = ""
    var estEmprunte = false
    // Constructeur
    constructor(titre: String, dateDeParution: String) : this() {
        this.titre = titre
        this.dateDeParution = dateDeParution
    }
    // méthode d'emprunt (par défaut)
    override fun emprunter(): Boolean {
        return false;
    }
    // méthode de retour (par défaut)
    override fun retourner(): Boolean {
        return false;
    }
    // méthode de consultation (par défaut)
    override fun consulter(): Boolean {
        return false;
    }
    // méthode d'affichage abstraite
    abstract fun afficher()
    // fonction d'affichage des durées
    fun afficherDuree(duree: Int): String {
        val heures = duree / 3600
        val minutes = (duree % 3600) / 60
        val secs = duree % 60
        return "${heures}h${minutes}m${secs}s"
    }
}
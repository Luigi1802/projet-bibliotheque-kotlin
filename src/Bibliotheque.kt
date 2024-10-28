/**
 * Classe Bibliotheque (gestion des Media)
 */
class Bibliotheque {
    // Attributs
    var medias:  MutableList<Media> = mutableListOf<Media>()
    var emprunts: MutableList<Media> = mutableListOf<Media>()
    // méthode d'ajout des Media à la Bibliotheque
    fun ajouterMedia(media: Media) {
        medias.add(media)
    }
    // implémentation de la méthode d'emprunt de Media
    fun emprunter(media: Media) {
        val result = media.emprunter()
        // Si le résultat de l'emprunt est true, on l'ajoute aux emprunts
        result && emprunts.add(media)
    }
    // implémentation de la méthode de retour de Media
    fun retourner(media: Media) {
        val result = media.retourner()
        // Si le résultat du retour est true, on le retire des emprunts
        result && emprunts.remove(media)
    }
    // implémentation de la méthode de consultation de Media
    fun consulter(media: Media) {
        media.consulter()
    }
    // méthode d'affichage des Media empruntés
    fun afficherEmprunts(){
        println("Emprunts en cours :")
        for (emprunt: Media in emprunts){
            emprunt.afficher()
        }
    }
}
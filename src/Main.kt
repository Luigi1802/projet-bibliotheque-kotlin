fun main() {
    // Création de la bibliothèque
    val bibliotheque = Bibliotheque()
    // Création des médias et ajout à la bibliothèque (format de date attendu : ISO 8601 (YYYY-MM-DD))
    val magazine = Magazine("National Geographic", "2024-10-28", "18")
    val journal = Journal("Le Monde", "2024-10-28", "quotidienne")
    val enregistrementAudio = EnregistrementAudio("Beethoven - Symphonie No.9", "1967-01-01", 960, "Musique classique")
    val dvd = Dvd("Inception", "2010-01-01", 8880, "Action")
    val livre = Livre("1984", "1972-01-01", "George Orwell", "Gallimard")
    val livre2 = Livre("Ubik", "1970-01-01", "Philip K. Dick", "J'ai lu")
    bibliotheque.ajouterMedia(magazine)
    bibliotheque.ajouterMedia(journal)
    bibliotheque.ajouterMedia(enregistrementAudio)
    bibliotheque.ajouterMedia(dvd)
    bibliotheque.ajouterMedia(livre)
    bibliotheque.ajouterMedia(livre2)
    // Parcours d'utilisation
    bibliotheque.consulter(livre)
    bibliotheque.emprunter(livre)
    bibliotheque.consulter(livre)
    bibliotheque.emprunter(livre2)
    bibliotheque.emprunter(dvd)
    bibliotheque.consulter(journal)
    bibliotheque.afficherEmprunts()
    bibliotheque.retourner(dvd)
    bibliotheque.retourner(livre2)
    bibliotheque.emprunter(enregistrementAudio)
    bibliotheque.afficherEmprunts()
}
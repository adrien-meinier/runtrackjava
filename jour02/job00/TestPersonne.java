// Classe de test
public class TestPersonne {
    public static void main(String[] args) {
        Personne p = new Personne(
            "Dupont",
            "Marie",
            "01/01/1990",
            "Paris",
            "123 rue de la Paix, 75000 Paris",
            "0123456789"
        );

        // Affichage des informations
        p.afficherInfos();

        // Accès aux attributs publics
        System.out.println("\nID :");
        System.out.println("Nom : " + p.nom);
        System.out.println("Prénom : " + p.prenom);

        // Accès aux attributs privés via getters
        System.out.println("\nAdresse  : " + p.getAdresse());
        System.out.println("Téléphone  : " + p.getTelephone());
    }
}
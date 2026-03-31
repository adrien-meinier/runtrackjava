public class GestionVehicules {
    public static void main(String[] args) {
        int anneeActuelle = 2026;

        // Création de plusieurs voitures
        Voiture v1 = new Voiture("Toyota", "15/06/2021", 20000, 1600, 5, 120, 35000);
        Voiture v2 = new Voiture("Renault", "10/03/2018", 18000, 1400, 5, 100, 45000);
        Voiture v3 = new Voiture("Ferrari", "01/01/2020", 250000, 3000, 2, 500, 12000);

        // Création de plusieurs avions
        Avion a1 = new Avion("Airbus", "01/01/2018", 50000000, "REACTION", 1200);
        Avion a2 = new Avion("Cessna", "05/06/2015", 1500000, "HELICES", 850);
        Avion a3 = new Avion("Piper", "10/09/2010", 500000, "HELICES", 2500);

        // Stockage dans des tableaux pour simplifier le traitement
        Voiture[] voitures = {v1, v2, v3};
        Avion[] avions = {a1, a2, a3};

        System.out.println("=== Voitures ===");
        for (Voiture v : voitures) {
            v.calculePrix(anneeActuelle); // calcul automatique du prix courant
            v.affiche();
            System.out.println("---------------------------");
        }

        System.out.println("\n=== Avions ===");
        for (Avion a : avions) {
            a.calculePrix(anneeActuelle); // calcul automatique du prix courant
            a.affiche();
            System.out.println("---------------------------");
        }
    }
}
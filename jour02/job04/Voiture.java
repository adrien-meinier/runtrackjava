public class Voiture extends Vehicule {
    private int cylindree;
    private int nbPortes;
    private int puissance;
    private double kilometrage;

    public Voiture(String marque, String dateAchat, double prixAchat,
                   int cylindree, int nbPortes, int puissance, double kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        double prix = getPrixAchat();

        // 1. Dépréciation 2% par année
        String[] parts = getDateAchat().split("/"); // format "dd/MM/yyyy"
        int anneeAchat = Integer.parseInt(parts[2]);
        int nbAnnees = anneeActuelle - anneeAchat;
        prix -= prix * 0.02 * nbAnnees;

        // 2. Dépréciation 5% pour chaque tranche de 10 000 km
        int tranchesKm = (int) Math.round(kilometrage / 10000.0);
        prix -= prix * 0.05 * tranchesKm;

        // 3. Dépréciation selon la marque
        String marque = getMarque();
        if (marque.equalsIgnoreCase("Renault") || marque.equalsIgnoreCase("Fiat")) {
            prix -= prix * 0.10;
        } else if (marque.equalsIgnoreCase("Ferrari") || marque.equalsIgnoreCase("Porsche")) {
            prix -= prix * 0.20;
        }

        // 4. Prix minimum = 0
        if (prix < 0) prix = 0;

        setPrixCourant(prix);
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Cylindrée : " + cylindree + " cm³");
        System.out.println("Nombre de portes : " + nbPortes);
        System.out.println("Puissance : " + puissance + " ch");
        System.out.println("Kilométrage : " + kilometrage + " km");
    }
}

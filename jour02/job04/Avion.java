public class Avion extends Vehicule {
    private String typeMoteur; // "HELICES" ou autre
    private double heuresVol;

    public Avion(String marque, String dateAchat, double prixAchat,
                 String typeMoteur, double heuresVol) {
        super(marque, dateAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.heuresVol = heuresVol;
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        double prix = getPrixAchat();

        // Dépréciation selon le type de moteur
        if (typeMoteur.equalsIgnoreCase("HELICES")) {
            int tranches = (int) Math.round(heuresVol / 100.0);
            prix -= prix * 0.10 * tranches;
        } else {
            int tranches = (int) Math.round(heuresVol / 1000.0);
            prix -= prix * 0.10 * tranches;
        }

        // Prix minimum = 0
        if (prix < 0) prix = 0;

        setPrixCourant(prix);
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Type de moteur : " + typeMoteur);
        System.out.println("Nombre d'heures de vol : " + heuresVol);
    }
}
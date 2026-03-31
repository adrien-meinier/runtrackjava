public class Vehicule {
    private String marque;
    private String dateAchat; // format "dd/MM/yyyy"
    private double prixAchat;
    private double prixCourant;

    public Vehicule(String marque, String dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
        this.prixCourant = 0.0;
    }

    public void setPrixCourant(double prixCourant) {
        this.prixCourant = prixCourant;
    }

    // getters pour sous-classes
    public String getMarque() { return marque; }
    public String getDateAchat() { return dateAchat; }
    public double getPrixAchat() { return prixAchat; }
    public double getPrixCourant() { return prixCourant; }

    public void affiche() {
        System.out.println("Marque : " + marque);
        System.out.println("Date d'achat : " + dateAchat);
        System.out.println("Prix d'achat : " + prixAchat + " euros");
        System.out.println("Prix courant : " + prixCourant + " euros");
    }

    public void calculePrix(int anneeActuelle) {
        int anneeAchat;
        try {
            String[] parts = dateAchat.split("/");
            anneeAchat = Integer.parseInt(parts[2]);
        } catch (Exception e) {
            System.out.println("Format de date invalide !");
            return;
        }

        int nbAnnees = anneeActuelle - anneeAchat;
        prixCourant = prixAchat * (1 - 0.01 * nbAnnees);
        if (prixCourant < 0) prixCourant = 0;
    }
}
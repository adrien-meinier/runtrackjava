public class Vehicule {
    private String marque;
    private String dateAchat;
    private double prixAchat;
    private double prixCourant;

    public Vehicule(String marque, String dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
        this.prixCourant = 0.0;
    }

    public void affiche() {
        System.out.println("Marque : " + marque);
        System.out.println("Date d'achat : " + dateAchat);
        System.out.println("Prix d'achat : " + prixAchat + " euros");
        System.out.println("Prix courant : " + prixCourant + " euros");
    }

    public void setPrixCourant(double prixCourant) {
        this.prixCourant = prixCourant;
    }
}

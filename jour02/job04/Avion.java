public class Avion extends Vehicule {
    private String typeMoteur; // ex: "HELICES" ou "REACTION"
    private double heuresVol;

    public Avion(String marque, String dateAchat, double prixAchat,
                 String typeMoteur, double heuresVol) {
        super(marque, dateAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.heuresVol = heuresVol;
    }

    @Override
    public void affiche() {
        super.affiche(); // affiche les attributs de Vehicule
        System.out.println("Type de moteur : " + typeMoteur);
        System.out.println("Nombre d'heures de vol : " + heuresVol);
    }
}
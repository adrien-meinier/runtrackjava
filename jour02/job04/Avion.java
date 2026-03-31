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
    // Cette annotation indique que la méthode qui suit 
    // remplace (ou redéfinit) une méthode héritée de la classe parente.
    // Avantages :
    // 1. Le compilateur vérifie que la méthode existe bien dans la classe parente.
    //    Cela évite les erreurs de frappe dans le nom ou la signature.
    // 2. Clarifie le code pour les autres développeurs : ils savent que cette méthode
    //    provient de l'héritage.
    // 3. Permet d'appeler la méthode parent avec super.nomDeLaMéthode()
    //    tout en ajoutant un comportement spécifique à la sous-classe.
    public void affiche() {
        super.affiche();
        System.out.println("Type de moteur : " + typeMoteur);
        System.out.println("Nombre d'heures de vol : " + heuresVol);
    }
}
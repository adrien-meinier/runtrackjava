public class Voiture extends Vehicule {
    private int cylindree;
    private int nbPortes;
    private int puissance;
    private double kilometrage;

    public Voiture(String marque, String dateAchat, double prixAchat,
                   int cylindree, int nbPortes, int puissance, double kilometrage) {
        super(marque, dateAchat, prixAchat); // appel au constructeur de Vehicule
        this.cylindree = cylindree;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
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
        super.affiche(); // affiche les attributs de Vehicule
        System.out.println("Cylindrée : " + cylindree + " cm³");
        System.out.println("Nombre de portes : " + nbPortes);
        System.out.println("Puissance : " + puissance + " ch");
        System.out.println("Kilométrage : " + kilometrage + " km");
    }
}

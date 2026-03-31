// FiguresGeometriques.java

class Rectangle {
    // Attributs privés
    private double largeur;
    private double longueur;

    // Constructeur
    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    // Getter pour la largeur
    public double getLargeur() {
        return largeur;
    }

    // Setter pour la largeur
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    // Getter pour la longueur
    public double getLongueur() {
        return longueur;
    }

    // Setter pour la longueur
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    // Méthode pour calculer la surface
    public double surface() {
        return largeur * longueur;
    }
}


       
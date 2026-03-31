class Rectangle extends Figure {
    private double largeur;
    private double longueur;

    public Rectangle(double x, double y, double largeur, double longueur) {
        super(x, y); // constructeur de Figure
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double surface() {
        return largeur * longueur;
    }
}


       
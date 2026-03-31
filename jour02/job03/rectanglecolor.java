class RectangleColore extends Rectangle {
    private int couleur;

    public RectangleColore(double x, double y, double largeur, double longueur, int couleur) {
        super(x, y, largeur, longueur);
        this.couleur = couleur;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
}
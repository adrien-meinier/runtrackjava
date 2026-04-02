class RectangleColore extends Rectangle {
    private String couleur;

    public RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString() + ", couleur=" + couleur;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false; // vérifie largeur + hauteur + même classe
        RectangleColore other = (RectangleColore) obj;
        if (couleur == null) return other.couleur == null;
        return couleur.equals(other.couleur);
    }
}

class Rectangle {
    protected double largeur;
    protected double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle [largeur=" + largeur + ", hauteur=" + hauteur + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false; // même classe exacte

        Rectangle other = (Rectangle) obj;
        return this.largeur == other.largeur && this.hauteur == other.hauteur;
    }
}

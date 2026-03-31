class Cercle {
    private double x;     // Coordonnée X du centre
    private double y;     // Coordonnée Y du centre
    private double rayon; // Rayon du cercle

    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRayon() {
        return rayon;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // Méthode pour calculer la surface
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    // Méthode pour vérifier si un point est à l'intérieur du cercle
    public boolean contientPoint(double px, double py) {
        double distanceCarree = (px - x) * (px - x) + (py - y) * (py - y);
        return distanceCarree <= rayon * rayon;
    }
}
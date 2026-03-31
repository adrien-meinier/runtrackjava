class Cercle extends Figure {
    private double rayon;

    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public boolean contientPoint(double px, double py) {
        double distanceCarree = (px - x) * (px - x) + (py - y) * (py - y);
        return distanceCarree <= rayon * rayon;
    }
}
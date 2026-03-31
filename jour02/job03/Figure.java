class Figure {
    protected double x;
    protected double y;

    // Constructeur
    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters pour x et y
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Méthode d'affichage
    public void affiche() {
        System.out.println("Centre : (" + x + ", " + y + ")");
    }
}

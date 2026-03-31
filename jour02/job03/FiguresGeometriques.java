public class FiguresGeometriques {
    public static void main(String[] args) {
        // Création d'un rectangle
        Rectangle rect = new Rectangle(0.0, 0.0, 5.0, 10.0);

        // Affichage des dimensions
        System.out.println("Largeur : " + rect.getLargeur());
        System.out.println("Longueur : " + rect.getLongueur());
        rect.affiche(); // Affichage du centre

        // Affichage de la surface
        System.out.println("Surface : " + rect.surface());

        // Modifier les dimensions
        rect.setLargeur(7.5);
        rect.setLongueur(12.0);

        System.out.println("\nAprès modification :");
        System.out.println("Largeur : " + rect.getLargeur());
        System.out.println("Longueur : " + rect.getLongueur());
        System.out.println("Surface : " + rect.surface());

        // Test Cercle
        Cercle cercle = new Cercle(0.0, 0.0, 5.0);
        System.out.println("\nCercle : centre = (" + cercle.getX() + ", " + cercle.getY() + "), rayon = " + cercle.getRayon());
        System.out.println("Surface cercle = " + cercle.surface());

        // Vérifier si des points sont à l'intérieur du cercle
        double px = 3.0, py = 4.0;
        System.out.println("Le point (" + px + ", " + py + ") est à l'intérieur du cercle ? " + cercle.contientPoint(px, py));

        px = 6.0; py = 0.0;
        System.out.println("Le point (" + px + ", " + py + ") est à l'intérieur du cercle ? " + cercle.contientPoint(px, py));
    }
}
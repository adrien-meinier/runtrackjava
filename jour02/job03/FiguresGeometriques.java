// Classe principale pour tester Rectangle
public class FiguresGeometriques {
    public static void main(String[] args) {
        // Création d'un rectangle
        Rectangle rect = new Rectangle(5.0, 10.0);

        // Affichage des dimensions
        System.out.println("Largeur : " + rect.getLargeur());
        System.out.println("Longueur : " + rect.getLongueur());

        // Affichage de la surface
        System.out.println("Surface : " + rect.surface());

        // Modifier les dimensions
        rect.setLargeur(7.5);
        rect.setLongueur(12.0);

        System.out.println("\nAprès modification :");
        System.out.println("Largeur : " + rect.getLargeur());
        System.out.println("Longueur : " + rect.getLongueur());
        System.out.println("Surface : " + rect.surface());
    }
}
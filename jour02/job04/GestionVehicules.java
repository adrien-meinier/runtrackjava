public class GestionVehicules {
    public static void main(String[] args) {
        Voiture v = new Voiture("Toyota", "15/06/2021", 20000, 1600, 5, 120, 35000);
        Avion a = new Avion("Airbus", "01/01/2018", 50000000, "REACTION", 1200);

        System.out.println("=== Voiture ===");
        v.affiche();
        System.out.println("\n=== Avion ===");
        a.affiche();
    }
}
public class GestionVehicules {
    public static void main(String[] args) {
        Vehicule v1 = new Vehicule("Toyota", "15/06/2021", 20000);
        v1.setPrixCourant(18000);
        v1.affiche();
    }
}
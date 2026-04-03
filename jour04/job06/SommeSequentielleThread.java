package jour04.job06;
import java.util.Scanner;

public class SommeSequentielleThread {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taille du tableau : ");
        int n = scanner.nextInt();

        int[] tableau = new int[n];

        // Saisie des valeurs
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + " : ");
            tableau[i] = scanner.nextInt();
        }

        SommeThread thread = new SommeThread(tableau);

        long debut = System.currentTimeMillis();

        thread.start();  // lancement
        thread.join();   // attente (séquentiel)

        long fin = System.currentTimeMillis();

        System.out.println("Somme totale : " + thread.getSomme());
        System.out.println("Temps d'exécution : " + (fin - debut) + " ms");

        scanner.close();
    }
}

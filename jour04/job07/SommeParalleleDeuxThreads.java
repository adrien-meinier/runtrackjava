package jour04.job07;
import java.util.Scanner;


public class SommeParalleleDeuxThreads {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taille du tableau : ");
        int n = scanner.nextInt();

        int[] tableau = new int[n];

        // Saisie
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + " : ");
            tableau[i] = scanner.nextInt();
        }

        int milieu = n / 2;

        // Création des threads
        SommeThread t1 = new SommeThread(tableau, 0, milieu);
        SommeThread t2 = new SommeThread(tableau, milieu, n);

        long debutTemps = System.currentTimeMillis();

        // Lancement en parallèle
        t1.start();
        t2.start();

        // Attente
        t1.join();
        t2.join();

        // Combinaison
        int sommeTotale = t1.getSomme() + t2.getSomme();

        long finTemps = System.currentTimeMillis();

        System.out.println("Somme totale : " + sommeTotale);
        System.out.println("Temps d'exécution : " + (finTemps - debutTemps) + " ms");

        scanner.close();
    }
}
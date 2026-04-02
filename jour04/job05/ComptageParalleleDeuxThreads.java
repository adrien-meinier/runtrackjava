package jour04.job05;
import java.util.Scanner;


public class ComptageParalleleDeuxThreads {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre maximum : ");
        int max = scanner.nextInt();

        int milieu = max / 2;

        // Création des deux threads
        CompteurThread t1 = new CompteurThread(1, milieu);
        CompteurThread t2 = new CompteurThread(milieu + 1, max);

        long debut = System.currentTimeMillis();

        // Lancement en parallèle
        t1.start();
        t2.start();

        // Attente des deux threads
        t1.join();
        t2.join();

        // Combinaison des résultats
        int total = t1.getResultat() + t2.getResultat();

        long fin = System.currentTimeMillis();

        System.out.println("Total compté : " + total);
        System.out.println("Temps d'exécution : " + (fin - debut) + " ms");

        scanner.close();
    }
}
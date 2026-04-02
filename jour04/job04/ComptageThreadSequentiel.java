package jour04.job04;

import java.util.Scanner;

class CompteurThread extends Thread {
    private int max;
    private int resultat = 0;

    public CompteurThread(int max) {
        this.max = max;
    }

    public void run() {
        for (int i = 1; i <= max; i++) {
            resultat++;
        }
    }

    public int getResultat() {
        return resultat;
    }
}

public class ComptageThreadSequentiel {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre maximum : ");
        int max = scanner.nextInt();

        CompteurThread thread = new CompteurThread(max);

        long debut = System.currentTimeMillis();

        thread.start();  // lance le thread
        thread.join();   // attend qu'il finisse

        long fin = System.currentTimeMillis();

        System.out.println("Total compté : " + thread.getResultat());
        System.out.println("Temps d'exécution : " + (fin - debut) + " ms");

        scanner.close();
    }
}

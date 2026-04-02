package jour04.job03;
import java.util.Random;
import java.util.Scanner;

public class MultiThreadWriter {

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.nanoTime();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne : ");
        int length = scanner.nextInt();

        String randomString = generateRandomString(length);

        // Découpage en deux parties
        int mid = length / 2;
        String part1 = randomString.substring(0, mid);
        String part2 = randomString.substring(mid);

        // Création des threads
        WriterThread t1 = new WriterThread(part1, 0);
        WriterThread t2 = new WriterThread(part2, mid);

        // Lancement
        t1.start();
        t2.start();

        // Attente de la fin
        t1.join();
        t2.join();

        long endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1_000_000.0;

        System.out.println("Écriture terminée dans output.txt");
        System.out.println("Temps d'exécution : " + executionTime + " ms");

        scanner.close();
    }

    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        return sb.toString();
    }
}
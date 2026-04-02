package jour04.job02;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringWriter {

    public static void main(String[] args) {

        // Début du chronométrage
        long startTime = System.nanoTime();

        Scanner scanner = new Scanner(System.in);

        // Demande de la longueur
        System.out.print("Entrez la longueur de la chaîne à générer : ");
        int length = scanner.nextInt();

        // Génération de la chaîne aléatoire
        String randomString = generateRandomString(length);

        // Écriture dans le fichier
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(randomString);
            System.out.println("Chaîne écrite dans le fichier output.txt");
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }

        // Fin du chronométrage
        long endTime = System.nanoTime();

        // Calcul du temps en millisecondes
        double executionTime = (endTime - startTime) / 1_000_000.0;

        System.out.println("Temps d'exécution : " + executionTime + " ms");

        scanner.close();
    }

    // Méthode pour générer une chaîne aléatoire
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }
}
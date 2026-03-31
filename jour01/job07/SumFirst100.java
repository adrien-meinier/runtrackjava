public class SumFirst100 {
    public static void main(String[] args) {

        int sum = 0; // Variable to store the sum

        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            sum = sum + i; // Add each number to the sum
        }

        // Display the result
        System.out.println("The sum of the first 100 integers is: " + sum);
    }
}

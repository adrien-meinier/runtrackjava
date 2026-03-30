public class Main3 {
    public static void main(String[] args) {

        // Create an array of 10 integers
        int[] T = new int[10];

        // Fill the array with integers from 0 to 9
        for (int i = 0; i < T.length; i++) {
            T[i] = i;
        }

        // Display some elements
        System.out.println("T[0] = " + T[0]);
        System.out.println("T[1] = " + T[1]);
        System.out.println("T[5] = " + T[5]);
        System.out.println("T[9] = " + T[9]);

        // T[10] would cause an error if uncommented
        // System.out.println("T[10] = " + T[10]);
    }
}

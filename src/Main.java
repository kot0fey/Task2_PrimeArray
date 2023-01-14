import java.util.Random;

public class Main {
    static boolean isPrime(int number) {
        int k = 2;
        while (k * k <= number) {
            if (number % k == 0) {
                return false;
            }
            k++;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] array = new int[20];
        Random rand = new Random();
        System.out.println("Original array:");

        for (int i = 0; i < 20; i++) {
            array[i] = rand.nextInt(0, 50);
            System.out.println(i + " - " + array[i]);
        }

        System.out.println("\nProcessed array:");

        for (int i = 2; i < 20; i++) {
            if (isPrime(i)) {
                if (isPrime(array[i])) {
                    System.out.println(i + " - " + array[i]);
                }
            }
        }
    }
}
public class PrimeNumberChecker {

    public static void main(String[] args) {
        // Hardcoded number to check
        int number = 29;

        // Checking if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }

        // Checking divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }
}

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Checking each number
        System.out.println("\nAnalysis of the numbers:");
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is a positive even number.");
                } else {
                    System.out.println(num + " is a positive odd number.");
                }
            } else if (num < 0) {
                System.out.println(num + " is a negative number.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

        // Comparing the first and last elements
        System.out.println("\nComparison of first and last elements:");
        if (numbers[0] > numbers[4]) {
            System.out.println("First element (" + numbers[0] + ") is greater than last element (" + numbers[4] + ").");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First element (" + numbers[0] + ") is less than last element (" + numbers[4] + ").");
        } else {
            System.out.println("First element (" + numbers[0] + ") is equal to last element (" + numbers[4] + ").");
        }

        scanner.close();
    }
}

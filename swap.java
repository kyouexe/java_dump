import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        // Swapping logic
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}

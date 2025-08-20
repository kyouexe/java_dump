import java.util.Scanner;

public class celsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Converting Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5/9;

        // Displaying the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
    }
}
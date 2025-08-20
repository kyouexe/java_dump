import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Converting Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Displaying the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");
    }
}
import java.util.Scanner;

public class athlete {
    public static void main(String[] args) {
        // Creating a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter the distance of the first side of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the distance of the second side of the triangle: ");
        double side2 = scanner.nextDouble();
		System.out.print("Enter the distance of the third side of the triangle: ");
        double side3 = scanner.nextDouble();
		double perimeter = side1 + side2 + side3;
		int distance = 5;
		double rounds = distance/perimeter;
        // Displaying the result
        System.out.println("The total number of rounds the athlete will run is " +rounds+ " to complete 5 km");
    }
}

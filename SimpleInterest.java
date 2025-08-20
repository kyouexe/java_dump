import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Creating a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();
        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        // Displaying the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}

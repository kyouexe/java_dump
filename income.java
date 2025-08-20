import java.util.Scanner;

public class income {
    public static void main(String[] args) {
        // Creating a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter bonus: ");
        double bonus = scanner.nextDouble();
		double income = salary + bonus;
        // Displaying the result
        System.out.println("The salary is INR " +salary+ " and bonus is INR " +bonus+ ".Hence Total Income is INR "+income);
    }
}

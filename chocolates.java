import java.util.Scanner;

public class chocolates {
    public static void main(String[] args) {
        // Creating a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfchocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        int given =  numberOfchocolates/numberOfChildren;
		int remain = numberOfchocolates%numberOfChildren;
        // Displaying the result
        System.out.println("The number of chocolates each child gets is " + given + "  and the number of remaining chocolates are " + remain);
    }
}

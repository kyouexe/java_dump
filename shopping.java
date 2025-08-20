import java.util.Scanner; // Import Scanner for user input

public class shopping {
    public static void main(String[] args) {
        double unitPrice, totalPrice;
        int quantity;
        Scanner input = new Scanner(System.in); // Create Scanner object

        // Input unit price
        System.out.print("Enter the unit price (INR): ");
        unitPrice = input.nextDouble();

        // Input quantity
        System.out.print("Enter the quantity: ");
        quantity = input.nextInt();

        // Calculate total price
        totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + 
                           " and unit price is INR " + unitPrice);

        input.close(); // Close Scanner
    }
}

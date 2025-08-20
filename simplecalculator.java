import java.util.Scanner;
class simplecalculator {
 public static void main(String[] args) {
	 double num1, num2, add, subtract, multiply, divide;
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the first number: ");
	 num1 = input.nextDouble();
	 System.out.print("Enter the second number: ");
	 num2 = input.nextDouble();
	 add = num1 + num2;
	 System.out.println("Sum of the two numbers is: "+add);
	 subtract = num1 - num2;
	 System.out.println("Difference of the two numbers is: "+subtract);
	 multiply = num1 * num2;
	 System.out.println("Product of the two numbers is: "+multiply);
	 divide = num1 / num2;
	 System.out.println("Division of the two numbers is: "+divide);

 }
}
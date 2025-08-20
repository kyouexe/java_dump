import java.util.Scanner;
class division {
 public static void main(String[] args) {
	 int num1, num2, quotient, remainder;
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the first number = ");
	 num1 = input.nextInt();
	 System.out.print("Enter the second number = ");
	 num2 = input.nextInt();
	 quotient = num1/num2;
	 remainder = num1%num2;
	 System.out.println("The Quotient is "+quotient+ " and Remainder is "+remainder);
 }
}
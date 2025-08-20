import java.util.Scanner;
class intoperations {
 public static void main(String[] args) {
	 int a, b, c, s1, s2, s3, s4;
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the value of a = ");
	 a = input.nextInt();
	 System.out.print("Enter the value of b = ");
	 b = input.nextInt();
	 System.out.print("Enter the value of c = ");
	 c = input.nextInt();
	 s1 =  a + b *c;
	 s2 = a * b + c;
	 s3 =  c + a / b;
	 s4 = a % b + c;
	 System.out.println("The results of Int Operations are: " + s1 + " " + s2 + " " + s3 + " " + s4);
 }
}
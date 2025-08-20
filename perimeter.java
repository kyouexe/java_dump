import java.util.Scanner;
 public class perimeter {
  public static void main(String[] args) {
   double perimeter;
   Scanner input = new Scanner(System.in);
   System.out.print("Perimeter of the Square : ");
   perimeter = input.nextDouble();
   double length = perimeter / 4;
   System.out.println("The length of the side is " +length+ " whose perimeter is " +perimeter);
 }
}
import java.util.Scanner;
public class height {
 public static void main(String[] args) {
  double height;
  Scanner input = new Scanner(System.in);
  System.out.print("Height = ");
  height = input.nextDouble();
  double heightInInches = height/2.54;
  double heightInFeet = heightInInches/12;
  System.out.println("Your Height in cm is " +height+ " while in feet is " +heightInFeet+ " and inches is " +heightInInches);
 }
}

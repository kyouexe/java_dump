import java.util.Scanner;
public class convert {
 public static void main(String[] args) {
  double km;
  Scanner input = new Scanner(System.in);
  System.out.print("Distance = ");
  km = input.nextInt();
  double mile = km*1.6;
  System.out.println("The total miles is " +mile+ " mile for the given " +km+ " km ");
 }
}
  
  
  

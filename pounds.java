import java.util.Scanner;
 public class pounds {
  public static void main(String[] args) {
   double weightKilo, weightPounds;
   Scanner input = new Scanner(System.in);
   System.out.println("Weight in pounds : ");
   weightPounds = input.nextDouble();
   weightKilo = weightPounds/2.2;
   System.out.println("The weight of the person in pounds is " +weightPounds+ " and in kg is " +weightKilo);
 }
}
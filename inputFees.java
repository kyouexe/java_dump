import java.util.Scanner;
public class inputFees {
 public static void main(String[] args) {
  double fees , discountPercent , discountAmount , discountedFee ;
  Scanner input = new Scanner(System.in);
  System.out.print("Fees = ");
  fees = input.nextDouble();
  System.out.print("Discount Percent = ");
  discountPercent = input.nextDouble();
  discountAmount = fees*discountPercent/100;
  discountedFee = fees - discountAmount;
  System.out.println("The discount amount is INR " +discountAmount+ " and final discounted fee is INR " +discountedFee);
 }
}

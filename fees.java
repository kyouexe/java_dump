class fees {
 public static void main(String[] args) {
  int fees = 125000 , discountPercent = 10 , discountAmount , discountedFee ;
  discountAmount = fees*10/100;
  discountedFee = fees - discountAmount;
  System.out.println("The discount amount is INR " +discountAmount+ " and final discounted fee is INR " +discountedFee);
 }
}

class profit{
 public static void main(String[] args) {
  double costPrice = 129 , sellingPrice = 191 , profit , profitPercentage;
  profit = sellingPrice - costPrice;
  profitPercentage = profit/costPrice * 100;
  System.out.println("The Cost Price is INR " +costPrice+ " and Selling Price is INR " +sellingPrice+ "\n The Profit is INR " +profit+ " and the Profit Percentage is " +profitPercentage);
 }
}
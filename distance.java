import java.util.Scanner;
class distance {
 public static void main(String[] args) {
	 double distance, distyard, distmile;
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter distance travelled in feet = ");
	 distance = input.nextDouble();
	 distyard = distance/3;
	 distmile = distyard/1760;
	 System.out.println("The distance travelled in yards is " +distyard+ " and in miles is "+distmile);
 }
}
import java.util.Scanner;
class triangle {
 public static void main(String[] args) {
	 double base, baseInches, height, heightInches, areaInches, area;
	 Scanner input = new Scanner(System.in);
	 System.out.print("Base of the triangle= ");
	 base = input.nextDouble();
	 System.out.print("Height of the triangle= ");
	 height = input.nextDouble();
	 baseInches = base*2.54;
	 heightInches = height*2.54;
	 area = (base*height)/2;
	 areaInches = (baseInches*heightInches)/2;
	 System.out.println("The area of triangle in centimeters is " +area+ " and in inches is "+areaInches);
 }
}
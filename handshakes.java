import java.util.Scanner;
 public class handshakes {
  public static void main(String[] args) {
   int numberOfstudents,handshakes;
   Scanner input = new Scanner(System.in);
   System.out.println("Number of students: ");
   numberOfstudents = input.nextInt();
   handshakes = (numberOfstudents*(numberOfstudents-1))/2;
   System.out.println("The possible number of handshakes are: "+handshakes);
 }
}
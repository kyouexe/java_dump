import java.util.Scanner; 
public class NumberStorageAndSum {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); 
double[] numbers = new double[10]; 
double total = 0.0; 
int index = 0; 
System.out.println("Enter up to 10 numbers (Enter 0 or a negative number to stop):");
while (true) {
System.out.print("Enter number: ");
double num = scanner.nextDouble();
if (num <= 0) { 
break;
}
if (index == 10) { 
break;
}
numbers[index] = num; 
index++; 
}
System.out.println("\nNumbers Entered:");
for (int i = 0; i < index; i++) {
System.out.print(numbers[i] + " "); 
total += numbers[i]; 
}
System.out.println("\nTotal Sum: " + total); 
scanner.close(); 
}
}

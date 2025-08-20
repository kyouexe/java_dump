import java.util.Scanner;
public class FizzBuzz {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a positive integer: ");
int num = scanner.nextInt();
scanner.close();
if (num <= 0) {
System.out.println("Please enter a positive integer.");
return;
}
String[] results = new String[num + 1];
for (int i = 0; i <= num; i++) {
if (i % 3 == 0 && i % 5 == 0) {
results[i] = "FizzBuzz";
} else if (i % 3 == 0) {
results[i] = "Fizz";
} else if (i % 5 == 0) {
results[i] = "Buzz";
} else {
results[i] = String.valueOf(i);
}
}
for (int i = 0; i <= num; i++) {
System.out.println("Position " + i + " = " + results[i]);
}
}
}
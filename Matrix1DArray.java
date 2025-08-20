import java.util.Scanner;
public class Matrix1DArray {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int rows = scanner.nextInt();
System.out.print("Enter the number of columns: ");
int columns = scanner.nextInt();
int[][] matrix = new int[rows][columns];
System.out.println("Enter the elements of the matrix:");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
System.out.print("Element at [" + i + "][" + j + "]: ");
matrix[i][j] = scanner.nextInt();
}
}
int[] array = new int[rows * columns];
int index = 0;
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
array[index++] = matrix[i][j];
}
}
System.out.println("The 1D array is:");
for (int i = 0; i < array.length; i++) {
System.out.print(array[i] + " ");
}
scanner.close();
}
}

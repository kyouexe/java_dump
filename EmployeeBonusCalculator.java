import java.util.Scanner;
public class EmployeeBonusCalculator {
	public static void main(String[] args) {
		final int NUM_EMPLOYEES = 10;
		final double BONUS_5_YEARS = 0.05;
		final double BONUS_LESS_5_YEARS = 0.02;
		double[] salaries = new double[NUM_EMPLOYEES];
		double[] yearsOfService = new double[NUM_EMPLOYEES];
		double[] bonuses = new double[NUM_EMPLOYEES];
		double[] newSalaries = new double[NUM_EMPLOYEES];
		double totalOldSalary = 0;
		double totalBonus = 0;
		double totalNewSalary = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < NUM_EMPLOYEES; i++) {
			System.out.println("Enter details for Employee " + (i + 1) + ":");
			System.out.print("Enter salary: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Invalid input");
				scanner.next();
				System.out.print("Enter salary: ");
			}
			salaries[i] = scanner.nextDouble();
			while (salaries[i] < 0) {
				System.out.println("Enter again: ");
				salaries[i] = scanner.nextDouble();
			}
			System.out.print("Enter years of service: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Invalid input");
				scanner.next();
				System.out.print("Enter years of service: ");
			}
			yearsOfService[i] = scanner.nextDouble();
			while (yearsOfService[i] < 0) {
				System.out.println("Enter again: ");
				yearsOfService[i] = scanner.nextDouble();
			}
		}
		for (int i = 0; i < NUM_EMPLOYEES; i++) {
			double bonusPercentage = yearsOfService[i] > 5 ? BONUS_5_YEARS : BONUS_LESS_5_YEARS;
			bonuses[i] = salaries[i] * bonusPercentage;
			newSalaries[i] = salaries[i] + bonuses[i];
			totalOldSalary += salaries[i];
			totalBonus += bonuses[i];
			totalNewSalary += newSalaries[i];
		}
		System.out.println("\nEmployee Details and Bonus Calculation:");
		for (int i = 0; i < NUM_EMPLOYEES; i++) {
			System.out.printf("Employee %d: Salary = %.2f, Years of Service= %.2f, Bonus = %.2f, New Salary = %.2f\n",
(i + 1), salaries[i], yearsOfService[i],bonuses[i], newSalaries[i]);
		}
		System.out.println("\nSummary:");
		System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
		System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
		System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
		scanner.close();
	}
}

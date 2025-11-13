package p10;

import java.util.Scanner;

public class DemoAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		int count = 0;

		do {
			System.out.print("Enter a number or -1 to quit: ");
			double num = scanner.nextDouble();
			if (num == -1) {
				break;
			}
			total += num;
			count++;
		} while (true);
		if (count == 0) {
			System.out.println("You didn't enter numbers to calculate.");
		} else {
			System.out.printf("The average is %.2f%n" + (total / count));
		}
	}
}

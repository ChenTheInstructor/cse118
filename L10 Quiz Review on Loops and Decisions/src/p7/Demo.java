package p7;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		double n = 0;

		do {
			System.out.print("Enter a number: ");
			n = scanner.nextDouble();
			total += n;

		} while (total < 100);
		System.out.println("The total is: " + (total - n));
	}

}

package p8;

import java.util.Scanner;

public class DemoLargestAndSmallest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double largest = Double.MIN_VALUE;
		double smallest = Double.MAX_VALUE;
		System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
		System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
		

		do {
			System.out.print("Enter a number of -1 to quit: ");
			double n = scanner.nextDouble();
			if (n == -1) {
				break;
			} else {
				if (n < smallest) {
					smallest = n;
				}
				if (n > largest) {
					largest = n;
				}
			}

		} while (true);
		
		System.out.println("The smallest value entered: " + smallest);
		System.out.println("The largest value entered: " + largest);
	}

}

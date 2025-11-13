package p5_1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two ints with the 1st one smaller than the 2nd one: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int total = 0;
		if (n1 > n2) {
			System.out.println("The first one must be smaller than the second one.");
		} else {
			for (int i = n1 + 1; i < n2; i++) {
				total += i;
			}
			System.out.println("The total of numbers in between is: " + total);
		}
		
	}

}

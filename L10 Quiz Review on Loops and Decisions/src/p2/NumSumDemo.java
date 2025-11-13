package p2;

import java.util.Scanner;

public class NumSumDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int num = scanner.nextInt();
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		System.out.println("The factorial is: " + sum);
	}

}

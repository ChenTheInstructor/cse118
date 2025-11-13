package p5;

import java.util.Scanner;

public class EvenSumDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer:: ");
		int number = scanner.nextInt();
		int total = 0;
		for (int i = 1; i <= number; i++) {
			if(i % 2 == 1) {
				total += i;
			}
		}
		System.out.println("The sum of even numbers is: " + total);
	}

}

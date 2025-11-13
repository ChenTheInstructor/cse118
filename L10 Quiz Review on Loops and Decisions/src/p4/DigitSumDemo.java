package p4;

import java.util.Scanner;

public class DigitSumDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer:: ");
		int number = scanner.nextInt();
		
		int maxValue = 0;
		while(number > 0) {
			int digit = number % 10;
			if(digit > maxValue) {
				maxValue = digit;
			}
			number = number / 10;
		}
		
		System.out.println("The largest digit is: " + maxValue);
	}

}

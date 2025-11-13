package hw;

import java.util.Scanner;

public class DemoGuessingGame {

	public static void main(String[] args) {
		int secretNumber = 34;
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		do {
			System.out.println("Enter an integer between 1 and 100: ");
			int guessedNum = scanner.nextInt();
			if(guessedNum == -1) {
				System.out.println("Oh, you decided to quit.");
				System.out.println("You have made " + count + " bad guess(es).");
				break;
			}
			count++;
			if (guessedNum == secretNumber) {
				System.out.println("You guessed it right!");
				System.out.println("It took you " + count + " times to get it right.");
				break;
			} else {
				System.out.println("You guessed it wrong. ");
				if (guessedNum > secretNumber) {
					System.out.println("Your number is too great.");
				} else {
					System.out.println("Your number is too small.");
				}

			}

		} while (true);
	}
}

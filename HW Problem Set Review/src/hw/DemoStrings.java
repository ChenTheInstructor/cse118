package hw;

import java.util.Scanner;

public class DemoStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w1 = 0;
		int w2 = 0;
		int w3 = 0;
		int w4 = 0;
		int w5 = 0;
		int wLong = 0;
		String word = "";
		
		while (!word.equals("EXIT")) {
			System.out.print("Enter a word: ");
			word = scanner.nextLine().toUpperCase();

			switch (word.length()) {
			case 1 -> w1++;
			case 2 -> w2++;
			case 3 -> w3++;
			case 4 -> w4++;
			case 5 -> w5++;
			case 6, 7, 8, 9, 10, 11, 12, 13 -> wLong++;
			}
		}

		System.out.println("One letter words: " + w1);
		System.out.println("Two letter words: " + w2);
		System.out.println("Three letter word: " + w3);
		System.out.println("Four letter words: " + w4);
		System.out.println("Five letter words: " + w5);
		System.out.println("Longer words: " + wLong);

	}

}

package p1;

import java.util.Scanner;

public class VowelCountDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine().toUpperCase();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isAlphabetic(c) && c != 'A' && c != 'E' && c != 'I'
					&& c != 'O' && c != 'U') {
				count++;
			}
		}

		System.out.println("There are " + count + " consonants in " + str + ".");
	}

}

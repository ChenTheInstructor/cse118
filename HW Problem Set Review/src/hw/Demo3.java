package hw;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine().toUpperCase();
		// Race car
		String cleanStr = "";
		for(int i = 0; i<str.length(); i++) {
			if(Character.isLetterOrDigit(str.charAt(i))){
				cleanStr += str.charAt(i);
			}
		}
		
		String reverseCleanStr = "";
		for (int i = cleanStr.length() - 1; i >= 0; i--) {
			reverseCleanStr += cleanStr.charAt(i);
		}
		
		if(reverseCleanStr.equals(cleanStr)) {
			System.out.println("It's a palindrome!");
		} else {
			System.out.println("It's NOT a palindrome!");
		}
	}

}

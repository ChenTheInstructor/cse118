package hw;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String str1 = scanner.next();
		String str2 = scanner.next();
		
		int str1Len = str1.length();
		int str2Len = str2.length();
		System.out.println("String 1 length: " + str1Len);
		System.out.println("String 2 length: " + str2Len);
		
		System.out.println("Equal in content? " + str1.equals(str2));
		System.out.println("Equal address? " + (str1 == str2));
		
		int size = str1.compareTo(str2);
		if (size > 0) {
			System.out.println("String 1 is greater.");
		} else if ( size < 0) {
			System.out.println("String 2 is greater.");
		} else {
			System.out.println("The two strings are equals in size.");
		}
		
	}

}

package p3_ternary;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an age: ");
		int age = scanner.nextInt();

		String str = (age <= 18) ? "Child" : (age <= 60) ? "Adult" : "Senior";
		System.out.println(str);
	}

}

package p1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age, name and GPA: ");
		int age = scanner.nextInt();
		System.out.println("Enter your GPA: ");
		double gpa = scanner.nextDouble();
		
		scanner.nextLine(); // consume the enter key left from gpa entry
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("The name entered is: " + name);
		System.out.println("The age entered is: " + age);
		System.out.println("Next year, you will be: " + (age + 1));
		System.out.println("The GPA entered is: " + gpa);
	}

}

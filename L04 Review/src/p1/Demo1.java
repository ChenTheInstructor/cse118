package p1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		String n = scanner.nextLine();
//		System.out.println("Enter your age: ");
//		int age = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("Enter your major: ");
//		String major = scanner.nextLine();
//		System.out.println("Enter your GPA: ");
//		double gpa = scanner.nextDouble() + 1.0;
		
		System.out.println("Enter name, age, major, and GPA: ");
		String n = scanner.next();
		int age = scanner.nextInt();
		String major = scanner.next();
		double gpa = scanner.nextDouble();
		// display
		System.out.println("Name:" + n + ", Major:"+ major +", Age:" + age +", GPA:" + gpa);
	}

}

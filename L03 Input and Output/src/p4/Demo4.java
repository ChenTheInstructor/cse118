package p4;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age, gpa, and name (separated by a space): ");
		int age = scanner.nextInt();
		double gpa = scanner.nextDouble();
		String name = scanner.nextLine().trim();
		System.out.println("Name:" + name + ", Age:" + age + ", GPA:" + gpa);
	}

}

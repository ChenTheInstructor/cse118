package p2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age, GPA, and Name: ");
		int age = scanner.nextInt();
		double gpa = scanner.nextDouble();
		String name = scanner.next();
		System.out.println("Name:" + name + ", Age:" + age +", GPA:" + gpa);
	}

}

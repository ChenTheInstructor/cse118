package p1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name, GPA, and Age: ");
		String name = scanner.next();
		double gpa = scanner.nextDouble();
		int age = scanner.nextInt();
		int count = 1;
		double in = 0.1;
		int m = 1;
		int c = 65;
		String ft = "%-10d%-15S%5d%15.2f%n";
		// formatted printing into columns
//		System.out.printf(format_string_in_quotes, data); // syntax
		System.out.printf("%10s%-15S%5S%15S%n", "", "Name", "Age", "GPA");
		System.out.printf("%45s%n", "---------------------------------------------");
		System.out.printf(ft, count++, (name + " " + (char) (c++)), age++, (gpa));
		System.out.printf(ft, count++, (name + " " + (char) (c++)), age++, (gpa + m++  * in));
		System.out.printf(ft, count++, (name + " " + (char) (c++)), age++, (gpa + m++  * in));
		System.out.printf(ft, count++, (name + " " + (char) (c++)), age++, (gpa + m++  * in));
	}

}

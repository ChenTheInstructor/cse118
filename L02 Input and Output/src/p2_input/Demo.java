package p2_input;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);// allows to capture input from kb
//		System.out.println("Enter the first name: ");
//		String firstName = scanner.nextLine(); 
//		System.out.println("Enter the last name: ");// prompt user for data
//		String lastName = scanner.nextLine();
//		System.out.println(firstName + " " + lastName);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the full name: ");
//		String fullName = scanner.nextLine();
//		int space = fullName.indexOf(" ");
//		String firstName = fullName.substring(0, space);
//		String lastName = fullName.substring(space + 1);
//		System.out.println(lastName.toUpperCase() +", " + firstName);
//		String strr;
//		strr += "A";
		
		
		System.out.println("abc".compareTo("xyz"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println("Enter your GPA: ");
		double gpa = scanner.nextDouble();
		System.out.println("Name: " + name + "\tAge: " + age + "\t\tGPA: " + gpa);
	}

}

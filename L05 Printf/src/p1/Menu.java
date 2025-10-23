package p1;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "Olive Garden";
		String address = "1 Main Street, NY 10001";
		String phone = "201 123 4567";
		int count = 1;
		System.out.println("Enter dish name and price for item " + count++ + ": ");
		String dish1 = scanner.next();
		dish1 = dish1.replace("_", " ");
		double p1 = scanner.nextDouble();
		System.out.println("Enter dish name and price for item " + count++ + ": ");
		String dish2 = scanner.next();
		dish2 = dish2.replace("_", " ");
		double p2 = scanner.nextDouble();
		System.out.println("Enter dish name and price for item " + count++ + ": ");
		String dish3 = scanner.next();
		dish3 = dish3.replace("_", " ");
		double p3 = scanner.nextDouble();

		// display
		int item = 1;
		String ft = "\t\t%-5d%-20S%10.2f\n";
		String dashes = "-----------------------------------";
		System.out.println("\n\n\n\n\t\t          " + name);
		System.out.println("\t\t     " + address);
		System.out.println("\t\t          " + phone);
		System.out.printf("\t\t%35s\n", dashes);
		System.out.printf(ft, item++, dish1, p1);
		System.out.printf(ft, item++, dish2, p2);
		System.out.printf(ft, item++, dish3, p3);
		System.out.printf("\t\t%35s\n", dashes);

	}

}

package p6;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int item = 1;
		System.out.println("Enter the restaurant name: ");
		String name = scanner.nextLine();
		System.out.println("Enter the restaurant address: ");
		String address = scanner.nextLine();
		System.out.println("Enter the restaurant phone: ");
		String phone = scanner.nextLine();
		
		System.out.println("Enter three dishes: ");
		String dish1 = scanner.next();
		String dish2 = scanner.next();
		String dish3 = scanner.next();
		
		System.out.println("Enter their prices: ");
		double price1 = scanner.nextDouble();
		double price2 = scanner.nextDouble();
		double price3 = scanner.nextDouble();
		
		System.out.println("\t    " + name);
		System.out.println("\t" + address);
		System.out.println("\t    " + phone);
		System.out.println("---------------------------------------");
		System.out.println(item++ +".\t\t" + dish1.toUpperCase() + "\t\t" + price1);
		System.out.println(item++ +".\t\t" + dish2.toUpperCase() + "\t\t" + price2);
		System.out.println(item++ +".\t\t" + dish3.toUpperCase() + "\t\t" + price3);
		System.out.println("---------------------------------------");
	}

}

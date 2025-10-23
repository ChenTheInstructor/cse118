package p3;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter the second integer: ");
		int n2 = scanner.nextInt();
		
//		scanner.nextLine();
		
		System.out.println("Enter the operator: ");
		String op = scanner.next();
		
		System.out.println(n1 + " " + op + " " + n2);
	}

}

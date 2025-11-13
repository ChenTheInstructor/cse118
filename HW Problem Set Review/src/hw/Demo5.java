package hw;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter two numbers with the first one smaller: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		if(n1 >= n2) {
			System.out.println("The first number must be smaller!");
		} else {
			int total = 0;
			for(int i = n1 + 1; i < n2; i++) {
				total += i;
			}
			System.out.println("The total is: " + total + ".");
		}
	}

}

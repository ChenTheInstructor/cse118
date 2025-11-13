package p6;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		double total = 0;
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		
		do {
			System.out.print("Enter a number or -1 to quit: ");
			double n = scanner.nextDouble();
			if(n == -1) {
				flag = false;
			} else {
				total += n;
			}
		} while(flag);
		
		System.out.println("The total is: " + total);

	}

}

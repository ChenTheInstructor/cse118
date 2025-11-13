package hw;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf( "%2d%3S%1d%3s%2d%n",  i,  " x ", n , " = ",  (i * n));
		}
		
	}

}

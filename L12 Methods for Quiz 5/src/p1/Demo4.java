package p1;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = scanner.nextInt();
		System.out.println(sumUpTo(n));
	}
	
	public static int sumUpTo(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
//			sum = sum +  i;
			sum += i;
		}
		return sum;
	}

}

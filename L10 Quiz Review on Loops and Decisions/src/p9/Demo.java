package p9;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		String str = (n1 > n2)? "n1 is greater":(n1 == n2)?
				"The same":"n1 is smaller";
		System.out.println(str);
		//		if (n1 < n2) {
//			System.out.println(n1 + " is smaller.");
//		} else if (n1 == n2) {
//			System.out.println(n1 + " equals " + n2);
//		} else {
//			System.out.println(n1 + " is greater.");
//		}
	}

}

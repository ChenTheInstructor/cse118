package p4;

import java.util.Scanner;

public class StarTreeDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the width of the tree: ");
		int width = scanner.nextInt();
		for(int n = 10; n < width; n++) {
			showTree(n);
		}
	}
	// method
	public static void showTree(int width) {
		int mid = width / 2;

		for (int i = 0; i < mid; i++) {
			for (int blank = 0; blank < mid - i; blank++) {
				System.out.print(" ");
			}
			for (int star = mid - i; star <= mid + i; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int stem = 0; stem < 3; stem++) {
			for (int blank = 0; blank < mid; blank++) {
				System.out.print(" ");
			}
			System.out.println("||");
		}
	}

}

package p5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arr = getArray();
		System.out.println(Arrays.toString(arr));
	}

	private static int[] getArray() {
		Scanner s = new Scanner(System.in);
//		int[] a = new int[10];
		
		System.out.println("Enter 10 integers: ");
		String input = s.nextLine();
		String[] strArr = input.split(" ");
		int[] a = new int[strArr.length];
		int i = 0;
		
		for (String str : strArr) { // enhanced for-loop
			a[i++] = Integer.parseInt(str);
		}
		
		
//		for(int i = 0; i < a.length; i++) {
//			System.out.println("Enter an integer: ");
//			a[i] = s.nextInt();
//		}
		
		
//		System.out.println("Enter 10 integers: ");
//		int[] a = {s.nextInt(), s.nextInt(), s.nextInt(),
//				s.nextInt(), s.nextInt(), s.nextInt(),
//				s.nextInt(), s.nextInt(), s.nextInt(),
//				s.nextInt()
//				};
		return a;
	}

}

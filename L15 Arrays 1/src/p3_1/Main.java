package p3_1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		System.out.println(Arrays.toString(a));
		changeArrElements(a);
		System.out.println(Arrays.toString(a));
	}

	private static void changeArrElements(int[] a) {
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
	}

}

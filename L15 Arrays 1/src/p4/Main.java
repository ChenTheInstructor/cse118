package p4;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int[] a = getIntArr(20, 10, 10);
			
			int numEven = countEven(a);

			if (numEven > 3 * a.length / 4) {
				showArray(a);
				System.out.println("****" + numEven + "****");
			}
			
			if (numEven < a.length / 3) {
				showArray(a);
				System.out.println("****" + numEven + "****");
			}
		}

	}

	private static int countEven(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static void showArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] getIntArr(int hi, int lo, int size) {
		Random rand = new Random();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
//			arr[i] = lo + (int) (Math.random() * (hi - lo + 1));
			arr[i] = lo + rand.nextInt(hi - lo + 1);
		}
		return arr;
	}

}

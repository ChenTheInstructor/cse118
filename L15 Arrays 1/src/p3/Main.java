package p3;

public class Main {

	public static void main(String[] args) {
		int[] a = getIntArr(50, 20, 10);
		showArray(a);
		reverse(a);
		showArray(a);
//		int[] reversedArr = reverse(a);
//		showArray(reversedArr);
	}

	private static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - 1 - i);
		}
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
//	private static int[] reverse(int[] a) {
//		int[] reversedArr = new int[a.length];
//		for (int i = 0; i < a.length; i++) {
//			reversedArr[i] = a[a.length - 1 - i];
//		}
//		return reversedArr;
//	}

	public static void showArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] getIntArr(int hi, int lo, int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = lo + (int) (Math.random() * (hi - lo + 1));
		}
		return arr;
	}

}

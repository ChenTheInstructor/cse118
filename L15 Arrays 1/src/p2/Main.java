package p2;

public class Main {

	public static void main(String[] args) {
		int[] myArr = createArray(100);
		display(myArr);
		int max = findMax(myArr);
		int min = findMin(myArr);
		System.out.println("The max is: " + max);
		System.out.println("The min is: " + min);
	}
	
	public static int findMin(int[] arr) {
		int min= Integer.MAX_VALUE;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int findMax(int[] arr) {
		int max= Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
	public static void display(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
			if(i % 10 == 9) {
				System.out.println();
			}
		}
	}
	
	public static int[] createArray(int size) {
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		return arr;
	}

}

package p5_split;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String str = "fdsa fda fda fda fda fda daf af hadfg wer";
		String[] a = str.split(" ");
//		System.out.println(Arrays.toString(a));
		showArray(a);
		a[0] = "hello";
//		System.out.println(Arrays.toString(a));
		showArray(a);
	}
	
	public static void showArray(String[] a) {
		System.out.println("\n\n");
		for(String s : a) {
			System.out.println(s);
		}
	}

}

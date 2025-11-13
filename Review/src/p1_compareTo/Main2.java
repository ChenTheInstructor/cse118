package p1_compareTo;

public class Main2 {

	public static void main(String[] args) {
		System.out.println(func(3));
	}

	public static int func(int n) {
		if(n == 0) {
			return 1;
		}
		return 2 * func(n - 1);
	}
}

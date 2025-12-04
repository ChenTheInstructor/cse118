package p1;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println(square(5));
	}
	
	// Problem 1
	public static int maxOfTwo(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	// Problem 2
	public static boolean isEven(int n) {
		if(n % 2 == 0) {
			return true;
		}
		return false;
	}
	
	// Problem 3
	public static void printGreeting(String name) {
		System.out.println("Hello, " + name +"!");
	}
	
	// Problem 4
	public static int square(int n) {
		return n * n;
	}

}

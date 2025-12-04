package p1;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println(minOfTwo(100, 10)); // arguments as data
	}
	
	public static int minOfTwo(int n1, int n2) { // parameters
		if(n1 < n2) {
			return n1;
		} else {
			return n2;
		}
	}

}

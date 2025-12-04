package p1;

public class Demo5 {

	public static void main(String[] args) {
		System.out.println(getNumDigits(112131415));
	}

	public static int getNumDigits(int n) {
		
		
		return String.valueOf(n).length();
		
//		int count = 0;
//		String numStr = String.valueOf(n);
//		count = numStr.length();
//		return count;
	}
}

package p1;

public class Demo1 {

	public static void main(String[] args) {
		int result = getSign(0);
		System.out.println(result);
	}
	
	public static int getSign(int number) {
		if(number > 0) {
			return 1;
		} else if(number < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}

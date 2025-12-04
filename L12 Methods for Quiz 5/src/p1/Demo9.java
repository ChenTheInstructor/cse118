package p1;

public class Demo9 {

	public static void main(String[] args) {
		countDownBy(10, 6);
	}
	
	public static void countDownBy(int num, int step) {
		for(int i = num; i >= 0; i -= step) {
			System.out.println(i);
		}
	}
}

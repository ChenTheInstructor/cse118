package p1;

public class Demo7 {

	public static void main(String[] args) {
		repeatMessage("Hello", 3);
	}

	public static void repeatMessage(String message, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(message);
		}
		System.out.println();
	}
}

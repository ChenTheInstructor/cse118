package p1;

public class Demo3 {

	public static void main(String[] args) {
		printLine('A', 10);
		printLine('A', 10);
		printLine('A', 10);
	}
	
	public static void printLine(char ch, int count) {
		for(int i = 0; i < count; i++) {
			System.out.print(ch + " ");
		}
		System.out.println();
	}

}

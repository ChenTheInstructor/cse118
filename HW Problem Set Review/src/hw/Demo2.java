package hw;

public class Demo2 {

	public static void main(String[] args) {
		int total = 0;
		for (int n = 99; n >= 1; n--) {
			if (n % 2 == 1) {
				System.out.print(n + " ");
				
				if(n % 20 == 1) {
					System.out.println();
				}
			} else {
				total += n;
			}
		}
		System.out.println("\nThe total is: " + total + ".");
	}

}

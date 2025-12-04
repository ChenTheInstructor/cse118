package p1_math;

public class Demo1 {
	// Math.random() produce a random double between 0.0 and 1.0 exclusive
	public static void main(String[] args) {
		int amount = 100;
		for (int i = 0; i < 100; i++) {
//			System.out.printf("%.2f%n", getRandomNumber(1, 3));
			int n1 = getRandomInteger(5);
			int n2 = getRandomInteger(5);
			int n3 = getRandomInteger(5);
			System.out.print(n1);
			System.out.print("\t");
			System.out.print(n2);
			System.out.print("\t");
			System.out.println(n3);

			if (n1 == n2 && n1 == n3) {

				System.out.println("You just won $1000 bucks after spending " + (100 - amount) + "!");
				System.out.println("Go get your prize!");
				break;
			} else {
				amount -= 5;
				if (amount < 0) {
					System.out.println("You lost all your money.");
					break;
				} else {
					System.out.println("Sorry, play again.");
				}
			}

		}
	}

	public static int getRandomInteger(int cap) {
		return 1 + (int) (Math.random() * cap);
	}

	public static double getRandomNumber(int min, int max) {
		return min + Math.random() * (max - min);
	}
}

package p1_for_loop;

import java.util.Scanner;

public class MenuOrderApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many items would you like to order?");
		int numItems = scanner.nextInt();
		int i;
		for (i = 0; i < numItems; i++) {
			System.out.println("Enter item number " + (i + 1) +" (or 0 to quit): ");
			int item = scanner.nextInt();
			if(item == 0) {
				break;
			}
			String dish = switch (item) {
			case 1 -> "Beef";
			case 2 -> "Fish";
			case 3 -> "Spaghetti";
			case 4 -> "Soup";
			default -> "None";
			};
			System.out.println("You ordered " + dish +".\n");
		}
		System.out.println("You order a total of "  + i + " items.");
	}

}

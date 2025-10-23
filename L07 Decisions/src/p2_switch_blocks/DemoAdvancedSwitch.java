package p2_switch_blocks;

import java.util.Scanner;

public class DemoAdvancedSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number (1--12): ");
		int num = scanner.nextInt();

		String month = switch (num) {
		case 1, 12, 2 -> "Winter";
		case 3, 4, 5 -> "Spring";
		case 6, 7, 8 -> "Summer";
		case 9, 10, 11 -> "Fall";
		default -> {
			System.out.println("Invalid number, must be between 1 and 12!");
			yield "None";}
		};
		System.out.println(month);
	}

}

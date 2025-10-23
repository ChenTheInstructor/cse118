package p2_switch_blocks;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		String grade = scanner.nextLine();
		String s;
		switch (grade) {
		case "A":
			s ="The score: at or above 90.";
			break;
		case "B+":
			s = "The score: 85 -- 90.";
			break;
		case "B":
			s = "The score: 80 -- 85.";
			break;
		case "C+":
			s = "The score: 75 -- 80.";
			break;
		case "C":
			s = "The score: 70 -- 75.";
			break;
		case "D+":
			s = "The score: 65 -- 70";
			break;
		case "D":
			s = "The score: 60 -- 65.";
			break;
		case "F", "E":
			s = "The score: below 60";
			break;
		default:
			s = "There is no such letter grade!";
		}

		System.out.println(s);
	}

}

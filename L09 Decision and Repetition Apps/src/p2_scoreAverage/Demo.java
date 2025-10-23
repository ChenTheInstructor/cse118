package p2_scoreAverage;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double totalScore  = 0.0;
		int studentCount =0;
		
		while(true) {
			System.out.println("Do you want to continue? ");
			char answer = scanner.nextLine().toUpperCase().charAt(0);
			if(answer != 'Y') {
				break;
			} else {
				System.out.println("Enter the score: ");
				totalScore += scanner.nextDouble();
				studentCount++;
				scanner.nextLine();
			}
			System.out.println("There are " + studentCount + " students");
			System.out.println("The average score is: " + totalScore/studentCount);
		}
	}

}

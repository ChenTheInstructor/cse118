package p1_if_blocks;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your test score: ");
		int score = scanner.nextInt();
		
		if(score > 100) {
			score = 100;
		}
		
		if(score < 0) {
			score = 0;
		}
		
//		if(score > 100) {
//			score = 100;
//		} else {
//			score = 0;
//		}

		System.out.print("Your earned a(n) ");
		if (score >= 90) {
			System.out.println("A");
		} else if(score >= 80){
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else if(score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		System.out.println("The end.");
	}

}

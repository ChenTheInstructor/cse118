package p10;

import java.util.Scanner;

public class BMIDemo {

	public static void main(String[] args) {
		// BMI = (your weight × 703) ÷ (your height) * (your height)
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your weight and height: ");
		double weight = scanner.nextDouble();
		double height = scanner.nextDouble();

		double bmi = (weight * 703) / (height * height);

		/*
		 * Interpretation: 
		 * Underweight: < 18.5 
		 * Normal weight: 18.5 - 24.9 
		 * Overweight: 25 - 29.9 
		 * Obese: 30 or higher
		 */

		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi < 24.9) {
			System.out.println("Normal weight");
		} else if (bmi <= 29.9) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}
	}

}

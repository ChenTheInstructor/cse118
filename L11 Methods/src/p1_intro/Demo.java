package p1_intro;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int num1 = getNumber();
		int num2 = getNumber();
		char operator = getOperator();

		double result = compute(num1, num2, operator);

		showResult(result);
	}

	public static void showResult(double r) {
		System.out.println("The result of the operation is: " + r);
	}

	public static double compute(int n1, int n2, char op) {
		double result = switch (op) {
		case '+' -> (n1 + n2);
		case '-' -> (n1 - n2);
		case '*' -> (n1 * n2);
		case '/' -> (n1 / n2);
		default -> Double.MAX_VALUE;
		};
		return result;
	}

	public static char getOperator() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an operator (+, -, *, /): ");
		char operator = scanner.nextLine().charAt(0);
		return operator;
	}

	// public: access modifier: controls who may use the method getNumber.
	// static: the method getNumber belows to the class. Needed to be used
	// in another static method such main()
	// int: the data type to be returned to the caller (i.e., the main() method).
	// You must
	// have a return keyword to return data unless the return type is void
	// getNumber: the name of the new method
	// () may or may not contain parameters
	public static int getNumber() { // method header
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		return num;
	}

}

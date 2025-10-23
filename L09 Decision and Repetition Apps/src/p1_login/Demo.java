package p1_login;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username = "JohnDoe";
		String password = "Secret";

		while (true) {
			System.out.print("\nUsername: ");
			String user = scanner.nextLine();
			System.out.print("Password: ");
			String pass = scanner.nextLine();
			if (user.equalsIgnoreCase(username) && pass.equals(password)) {
				System.out.println("success!");
				System.out.print("Would you like to change password? ");
				char answer = scanner.nextLine().toUpperCase().charAt(0);
				if (answer == 'Y') {

					while (true) {
						System.out.print("Now enter your new password: ");
						pass = scanner.nextLine();
						if (pass.length() < 8) {
							System.out.println("The password must be at least 8 characters.");
						} else {
							password = pass;
							break;
						}
					}

					System.out.println("Your password has changed.");
					System.out.println("Your new password is: " + password);
				} else {
					System.out.println("You don't want to change the password.");
				}
				break;
			} else {
				System.out.println("Failure!");

			}
		}

//		boolean isSuccess;
//		do {
//			System.out.print("\nUsername: ");
//			String user = scanner.nextLine();
//			System.out.println("Password: ");
//			String pass = scanner.nextLine();
//			if(user.equalsIgnoreCase(username) && pass.equals(password)) {
//				System.out.println("success!");
//				isSuccess = true;
//			} else {
//				System.out.println("Failure!");
//				isSuccess = false;
//			}
//			
//		} while(!isSuccess);
	}

}

package p4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		String str = null;
		do {
			System.out.print("\nEnter a string: ");
			str = scanner.nextLine();
			
			if(str.equalsIgnoreCase("exit")) {
				System.out.println("You entered quit. Quiting...");
				break;
			}
			System.out.println(str);
			
			
		}while(true);
			
	}

}

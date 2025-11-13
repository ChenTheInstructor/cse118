package p2;

public class Demo {

	public static void main(String[] args) {
		int n = 4;

		String day = switch (n) {
		case 1 -> "MON";
		case 2 -> "TUE";
		case 3 -> "WED";
		case 4 -> "THU";
		case 5 -> "FRI";
		case 6 -> "SAT";
		case 7 -> "SUN";
		default -> "No such day for the digit.";
		};
		System.out.println(day);

//		switch(n) {
//		case 1 : 
//			System.out.println("Monday");
//			break;
//		case 2: 
//			System.out.println("Tuesday");
//			break;
//		case 3 : 
//			System.out.println("Wednesday");
//			break;
//		case 4: 
//			System.out.println("Thursday");
//			break;
//		case 5 : 
//			System.out.println("Friday");
//			break;
//		case 6: 
//			System.out.println("Saturday");
//			break;
//		case 7 : 
//			System.out.println("Sunday");
//			break;
//		default: 
//			System.out.println("No such day for the digit.");
//		}
	}

}

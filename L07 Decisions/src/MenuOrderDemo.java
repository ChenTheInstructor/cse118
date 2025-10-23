import java.util.Scanner;

public class MenuOrderDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the item number to order: ");
		int item = scanner.nextInt();

//		String type = switch (item) {
//		case 1, 2, 3 -> "Entree";
//
//		case 4 -> "Dessert";
//		case 5 -> {
//			System.out.println("Nice choice for breakfast.");
//			yield "Breakfast";
//			}
//		default -> {
//			System.out.println("No such item number!");
//			yield "Nothing";
//		}
//		
//		};
		
		String type = (item>= 1 && item <= 3) ? "Entree": 
			(item == 4)? "Dessert":(item == 5)? 
					"breakfast":"no such item";

		String dish = "";
		switch (item) {
		case 1:
			dish = "Beef";
			break;
		case 2:
			dish = "Spaghetti";
			break;
		case 3:
			dish = "Fish";
			break;
		case 4:
			dish = "Ice Cream";
			break;
		case 5:
			dish = "Milk and Eggs";
			break;
		default:
			dish = "No dish";

		}

		System.out.println("You ordered " + type + " with " + dish + ".");
	}

}

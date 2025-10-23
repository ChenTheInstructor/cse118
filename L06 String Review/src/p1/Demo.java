package p1;

public class Demo {

	public static void main(String[] args) {
//		String name = "John Doe Joseph Doe Smith";// a string object containing "Joe" created
//		System.out.println(name.replace("Doe","Zack"));
//		System.out.println(name.toLowerCase());
		String format = "%5d.%20s%15.2f%n";
		int menuItem = 1;
		double price = 19.99;
		String dish = "Beef";
		// to print a table use printf
		System.out.printf(format,menuItem, dish, price );
		System.out.printf(format,10, "Tomato Soup",9.99 );
		
	}

}

package p1_output;

public class Demo {

	public static void main(String[] args) {
		String name = "Jonothon";
		System.out.println(name.length()); // method used to do things
		System.out.println(name.charAt(name.length()-2));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.indexOf("n"));
		System.out.println(name.lastIndexOf("n"));
		System.out.println(name.substring(0, 2));
		System.out.println(name.substring(4));
		System.out.println(name.replace("o", "i"));
		System.out.println("Jojo".replace("j", "m").replace("J", "m"));
		
		String str = "John James Doe"; // hard coded data directly added
		str = str.toUpperCase();
		int firstSpace = str.indexOf(" ");
		int lastSpace = str.lastIndexOf(" ");
		
		
		String firstName = str.substring(0, firstSpace);
		String middleName = str.substring(firstSpace + 1, lastSpace);
		String lastName = str.substring(lastSpace + 1);
		System.out.println("First Name: " + firstName);
		System.out.println("Middle Name: " + middleName.charAt(0) + ".");
		System.out.println("Last Name: " + lastName);
	}

}

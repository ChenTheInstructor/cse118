package p1_Random;

import java.util.Random;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(getRandomInteger(10, 20));
//		}
		String sentence = "";
		
		for (int j = 0; j < 10; j++) {
			sentence += getWord() + " ";
		}
		System.out.println(sentence.toLowerCase());
	}
	
	public static String getWord() {
		int length = (int)(1 + Math.random() * 8);
		String word = "";
		for (int i = 0; i < length; i++) {
			int n = getRandomInteger(65, 91);
			word += (char) n;
		
		}
		return word;

	}

	public static int getRandomInteger(int min, int max) {
		Random random = new Random();
		return min + random.nextInt(max - min);
	}

	public static double getRandomDouble(int min, int max) {
		Random random = new Random(); // created a Random object
		return min + random.nextDouble(max - min);
	}

}

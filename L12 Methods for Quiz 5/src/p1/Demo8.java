package p1;

public class Demo8 {

	public static void main(String[] args) {
		String remarks = gradeCategory(60);
		System.out.println(remarks);
	}
	
	public static String gradeCategory(int score) {
		if(score >= 90) {
			return "Excellent";
		} else if (score >= 80) {
			return "Good";
		} else if (score >= 70) {
			return "fair";
		} else {
			return "Needs Improvement";
		}
	}

}

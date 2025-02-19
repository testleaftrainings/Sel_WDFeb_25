package weekOneDayTwo;

public class LearnElseIF {

	public static void main(String[] args) {
		///  Category
		// playschool (2-4), primary level(5-9), middle(10-14) , higher(15-19)
		int age =19;		
		if (age>=2 && age<=4) {
			System.out.println("Playschool");			
		}
		else if (age>=5 && age<=9) {
			System.out.println("Primary");	
		}
		else if (age>=10 && age<=14) {
			System.out.println("Middle");
		}
		else if (age>=15 && age<=19) {
			System.out.println("Higher");	
		}
		// fallback logic
		else {
			System.out.println("You are not inside the school system");
		}
		
		System.out.println("---");		
	}

}

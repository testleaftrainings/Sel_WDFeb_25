package weekOneDayTwo;

public class LearnMethodSignature {

	// return type //indentifier // parameter -() empty or null
	private void simpleAdd() {
		int a = 3, b = 4;
		char c = 'A';

		System.out.println(a + b);
		System.out.println(c);
	}

	void simpleAdd1() {
		int a = 3, b = 4;
		char c = 'A';

		System.out.println(a + b);
		System.out.println(c);
	}

	// access modifier //keyword //return type //indentifier
	public static void main(String[] args) {

		// Classname objectName = new Classname();
		// camel casing to be followed while creating the object
		LearnMethodSignature lm;
		lm = new LearnMethodSignature();

		/// objectname //(.)--> to get the properties //type the method name
		lm.simpleAdd();

		LearnMethodSignature lm1;
		lm1 = new LearnMethodSignature();
		lm1.simpleAdd();

	}

}

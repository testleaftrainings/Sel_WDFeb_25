package weekOneDayTwo;

public class LearnSelection {

	public static void main(String[] args) {

		boolean prime = false;
		// if(conditon ----> will accept only boolen type)
		if (prime) {
			System.out.println("selected movie will be played");
		} else {
			System.out.println("Please subscribe to the prime");
		}

		int a = 2, b = 2;
		// logic to check whether both the variable holds the same value
		// relation operator
		if (a == b) {
			System.out.println("both a and b holds same value");

		}
		// fallback logic?-- even condition is failed this else block will get execute
		else {
			System.out.println("both a and b  does not holds  the same value");

		}

	}

}

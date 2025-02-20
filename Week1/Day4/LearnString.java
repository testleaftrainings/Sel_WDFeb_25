package weekOneDayFour;

public class LearnString {

	public static void main(String[] args) {

		// using literal
		// how to pass value inside the string var
		String text ="testleaf";
		String text2 ="Testleaf";
		
		//
		String [] arrText= {"abc","bcd","cde"};
		
		// INSTANCE WAY TO CREATING string
		String text1 = new String("Testleaf");
		String text3 = new String("Testleaf");
		
		System.out.println("using litral way");
		System.out.println(text);
		System.out.println("using instance way");
		System.out.println(text1);
		
		int lengthText = text.length();
		System.out.println(lengthText);
		// text==text1 -> true means if block will get execute
		if (text.contains("Test")) {
			
			// contains()-- is case sensitive
			System.out.println("yes it matches");
			
		}
		// text==text1 -> false means else block will get execute
		else {
			System.out.println("no it does'nt matches");
		}
		
		
		
		
		
		
		
		
		
		
	}

}

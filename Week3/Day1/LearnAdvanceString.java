package week3.day1;

public class LearnAdvanceString {

	public static void main(String[] args) {

		String advanceText = "Welcome to Testleaf  chennai-600040 @!#$!%";
		// 									delimiter
		String[] split = advanceText.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i].toLowerCase());
		}
		//								begining index , targeted/ending index
		// 10,00,000 - 10 lakh is equal to  1,000,000 one million 
		System.out.println(advanceText.substring(2,12));
		
		String replace = advanceText.replaceAll("[^a-zA-Z]","");
		
		System.out.println(replace);
		
		
		
		
		
	}

}

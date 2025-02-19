package WeekOneDayThree;

public class LearnLoopStatement {

	public static void main(String[] args) {
		
		// using literals
		// declared using type[] arrayName
		//initial the data inside an array?
	    //cursly{} , will help to separate the value
		
		int[] empNo= {112233,112244,112255,112266,112277};		
		/*
		 * 112233==> index 0
		 * 112244==> index 1
		 * 112255==> index 2
		 * 112266==> index 3
		 * 112277==> index 4
		 */	
		int length = empNo.length; //shortcut - ctrl+2,L
		for (int i = 0; i < length; i++) {
			
			System.out.println("index no  "+i+"--");
			System.out.println(empNo[i]);
			
		}
		
		
	
		
		
		
		

	}

}

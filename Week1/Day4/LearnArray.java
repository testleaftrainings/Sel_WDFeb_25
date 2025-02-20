package weekOneDayFour;

public class LearnArray {

	public static void main(String[] args) {

		
		// Literal
		int [] num= {
				11,// 0
				12,// 1
				13,// 2
				14//3
				//4
		};
		
		
		System.out.println(num.length);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		//System.out.println(num[4]);
		System.out.println("--------------------------------");
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		// intantiation 
		
		System.out.println("---------------------------");
		
		int num1[] = new int[10];
		num1[0]= 123;
		num1[1]= 234;
		num1[2]= 456;
		num1[3]= 678;
		num1[0]=999;
		
		System.out.println(num1[0]);
		
		System.out.println(num1.length);
		
		for (int i = 0; i < num1.length; i++) {
			num1[i]=888;
		}
		             
		for (int i = 0; i < num1.length; i++) {
			
			
			System.out.println(num1[i]);
		}
		
		
		
		
		
		
		
	}

}

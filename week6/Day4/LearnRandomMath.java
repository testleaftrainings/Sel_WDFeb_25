package week6.day4;

public class LearnRandomMath {

	public static void main(String[] args) {
		
		int ranNum1=(int)(Math.random()*9999);
		int ranNum2=(int)(Math.random()*9999);

		System.out.println(ranNum1);
		System.out.println(ranNum2);
		
		String num="9"+ranNum1+ranNum2;
		
	   // int phno= 9988776655;
		
		System.out.println(num);// 995883
		
		//9997.77719712914
        //7790.996466517293
		//8383.470479249603
	}

}

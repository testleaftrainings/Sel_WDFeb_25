package week2.day4;

public interface Rbi {

	// abstract method --> hidden methods/ unimplemented methods
	String pancardNum="abd124";
	
	//100% abstract--> till java 1.7
	//unimplemented method
	public void kyc();
	
	//unimplemented method
	void withDraw();
	
	
	//is java 1.8 is 100% abstract--> 
	
	// implemented method
	static void atmPayment() {
		 
		 System.out.println("20000 Per transactions");
		
	}
	// implemented method
	 void internetBanking(); 
	 
	 // we cannot create the object in the interface
	 
		
	}
	 
	
	


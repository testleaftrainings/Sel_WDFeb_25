package week2.day4;

public abstract class HdfcHq implements Rbi {
	// we cannot create the object in the abstract
	
	// implemented
	@Override
	public void internetBanking() {
		System.out.println("IB mandatory");
		
	}
	
	
	protected void hqLocation() {
	System.out.println("Mumbai");

	}
	
	// unimplemented method/ abstract method
	// interface -2 , abstract -1 => 3
	abstract void creditCardLimit();
	
	
	
	
	
	
	
	
	

}

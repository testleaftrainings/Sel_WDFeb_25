package week2.day4;

public class HdfcBank implements Rbi {

	// implementing the method here by overriding the method
	@Override
	public void kyc() {

		System.out.println("PanCard is must to create the bank account");
	}

	@Override
	public void withDraw() {
		System.out.println("For payments more than 10L the pancard no is must");

	}

	public static void main(String[] args) {
		
		HdfcBank hdfc = new HdfcBank();
		hdfc.kyc();
		hdfc.withDraw();
		//hdfc.bankRate();

	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}

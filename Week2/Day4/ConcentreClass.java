package week2.day4;

public class ConcentreClass extends HdfcHq {

	@Override
	public void kyc() {
		System.out.println("pan is must");
	}
	@Override
	public void withDraw() {
		System.out.println("20000 Per transaction");
	}
	@Override
	void creditCardLimit() {
		System.out.println("5lakhs is limit");
	}

	public static void main(String[] args) {

		ConcentreClass ccc = new ConcentreClass();
		ccc.kyc();
		ccc.creditCardLimit();
		System.out.println("Pancard number -->"+pancardNum);
		Rbi.atmPayment();
		ccc.internetBanking();
		
	}

}

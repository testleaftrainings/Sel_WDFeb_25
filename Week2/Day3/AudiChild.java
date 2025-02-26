package week2.day3;

public class AudiChild extends CarDC {

	public void speedLimit() {
		System.out.println("220 kmph is the higestest");
	}
	public static void main(String[] args) {
		AudiChild ac = new AudiChild();
		ac.noOfSeats();
		ac.brake();
		ac.headLight();
		ac.horn();
		ac.speedLimit();
		

	}

}

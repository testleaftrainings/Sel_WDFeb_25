package week2.day3;

public class CarDC extends AutomobileGP{
 
	
	public void noOfSeats() {
		System.out.println("minimum 5 seater");

	}
	
	
	public static void main(String[] args) {
//		AutomobileGP agp = new AutomobileGP();
//		agp.wheels=4;
//		System.out.println("no of wheels in the car "+agp.wheels);
//		agp.headLight();
//		agp.horn();
//		agp.brake();
		CarDC cdc= new CarDC();
		cdc.noOfSeats();
		cdc.headLight();
		cdc.wheels=4;
		System.out.println("no of wheels in the car "+cdc.wheels);
		
		
	}

}

package WeekOneDayThree;

public class RectangleComplexPath {
	// rule 1 : what type and how many variables we gonna declare
		int len, bre, ht, vol;

	public static void main(String[] args) {
		// step 1 : type--> classname object rec
		// We have declared a object here
		// step 2 : initialize the object "=", java keyword called new
		RectangleComplexPath rcp = new RectangleComplexPath();
		rcp.len = 10;
		rcp.bre = 20;
		rcp.ht = 30;
		//vol=len*bre*ht;
		rcp.vol = rcp.len * rcp.bre * rcp.ht;
		// "+" to concatinate the string message and the variable name
		System.out.println("the volume of the rectangle " + rcp.vol);
		
		RectangleComplexPath rcp1 = new RectangleComplexPath();
		rcp1.len = 6;
		rcp1.bre = 12;
		rcp1.ht = 24;
		//vol=len*bre*ht;
		rcp1.vol = rcp1.len * rcp1.bre * rcp1.ht;
		// "+" to concatinate the string message and the variable name
		System.out.println("the volume of the rectangle " + rcp1.vol);
		

	}

}

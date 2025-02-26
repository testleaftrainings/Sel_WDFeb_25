package week2.day3;

public class Calculator {

	// accepting an argument a,b
	public void addNum(int a, int b) {
		int c;

		c = a + b;
		System.out.println(c);

	}

	public void addNum(double a, double b) {
		double c;

		c = a + b;
		System.out.println(c);

	}

	public void addNum(double a, double b, double c) {
		double d;

		d = a + b + c;
		System.out.println(d);

	}

	// not accepting anything as argument
	public void addNum() {
		int a, b, c, d;
		a = 4;
		b = 5;
		c = 8;
		d = a + b + c;
		System.out.println(d);

	}

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		// method overloading --> arguments
		cal.addNum(1.5,7.6);
	}

}

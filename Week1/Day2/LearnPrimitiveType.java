package weekOneDayTwo;

public class LearnPrimitiveType {

	public static void main(String[] args) {

		// datatype variable name;
		// declaration is done here
		// initialize this variable
		// using the symbole "="
		// Integer category - Default type is int
		byte box = 11;

		// box ---> 11*12=
		byte box1 = 12;
		byte box2;

		// narrowing
		box2 = (byte) (box * box1);
		
		// 132
		System.out.println("Byte data range"+box2);
		// widening
		int box3 = 11;
		System.out.println("int data value"+box3);

		long box4 = 8899776655l;
		System.out.println("long data value"+box4);

		// float category - Default type is double

		float box5 = 87.1234f;
		System.out.println("float data value"+box5);
		
		double box6 = 67.73737383;
		System.out.println("double data value"+box6);

		// 'literals'- within single quotes
		char box7 = 67;
		System.out.println("char data value"+box7);
		// "userDefinedvalue or data"- within double quotes
		String box8 = "67.737.373.83";
		System.out.println("String data value"+box8);
		///
		boolean box9 = false;
		System.out.println("boolean data (true/false)value"+box9);

		// basic operator --> +,-,*,/,%
		// type promotion in java;
		// when we are performing some basic operation the java will automatically
		// int---> compiler is asking us to change the type to int
		// operand: answer box2
	}

}

package week4.day1;

public class LearnStatic {
	static int a = 3; // exe flow :1
	static int b;// only declared//exe flow :2
	int c = 14;
	static void math(int x) {
		System.out.println("value of a :" + a);
		System.out.println("value of b :" + b);
		System.out.println("value of c :" + x);
	}
	static {
		b = a * 4;// initiliastion //exe flow :3
		System.out.println("static block is called here");// exe flow :4
	}
	// exe flow :5
	public static void main(String[] args) {
		math(20);
	}
}

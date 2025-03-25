package week6.day1;

public class ConstructorChain {
	
	String cname="Leaftaps";
	public ConstructorChain() {
		System.out.println("this is default constructor");
	}
	
	ConstructorChain(String cname){
		this();// default constructor
		System.out.println("PARAMETERIZED CONSTRUCTOR CALLS THE COMPANY NAME :"+cname);
		System.out.println(this.cname);
	}
	ConstructorChain(String cname, int num){
		this("TestLeaf");// single argumented constructor
		System.out.println("Two Argument CONSTRUCTOR CALLS THE COMPANY NAME :"+cname);
		System.out.println("Two Argument CONSTRUCTOR CALLS THE COMPANY NAME :"+num);
	}

	public static void main(String[] args) {
		
		new ConstructorChain("Qeagle",673);// two argumented constructor
		
		

	}

}

package week5.day4;

public class SuperConstructor {
	
	SuperConstructor(){
		
		System.out.println("Default constructor is from SuperConstructor Class");
		
	}

	public SuperConstructor(String string) {
		System.out.println("Parameterized constructor from SuperConstructor Class with the argument company name is :"+ string);
	}
	public SuperConstructor(String string,int num) {
		System.out.println("Parameterized constructor from SuperConstructor Class with the argument company name is :"+ string);
		System.out.println("Parameterized constructor from SuperConstructor Class with the argument company no is :"+ num);
	}

	
}

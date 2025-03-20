package week5.day4;

public class LearnConstructor extends SuperConstructor {
	
	LearnConstructor(){
		super();//---> properties from the parent
		// this ----> properties from the child
		System.out.println("Default constructor");
		
	}

	public LearnConstructor(String string) {
		System.out.println("Parameterized constructor with the argument company name is :"+ string);
	}
	public LearnConstructor(String string,int num) {
		System.out.println("Parameterized constructor with the argument company name is :"+ string);
		System.out.println("Parameterized constructor with the argument company no is :"+ num);
	}

	public static void main(String[] args) {
		
		// classname =
		new LearnConstructor();
		

	}

}

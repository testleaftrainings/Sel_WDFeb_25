package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		
		// stores the mentors name as group variable ;
		
		String mentor0="harrish";
		String mentor1="uday";
		String mentor2="vinoth";
		String mentor3="vinoth";
		
		//if you want to store this data into an array
		
		// List -> java collection
// interface     Generic type              Implementation class/ concrete class
		List     <String>   mentors = new  ArrayList<String>();
		mentors.add("harrish");
		mentors.add("uday");
		mentors.add("vinoth");
		mentors.add("vineeth");
		mentors.add(mentor3);
		
		// size()--> size an list 
		int sizeOfMentors= mentors.size();
		
		System.out.println(sizeOfMentors);
		// 5
		
		System.out.println(mentors);
		//[harrish, uday, vinoth, vineeth, vinoth]
		mentors.remove(4);
		System.out.println("<--after removing the data from the list --->");
		System.out.println(sizeOfMentors);
		//4
		System.out.println(mentors);
		//[harrish, uday, vinoth, vineeth]
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

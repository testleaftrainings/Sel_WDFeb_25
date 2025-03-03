package week2.day4;

import java.util.ArrayList;
import java.util.LinkedList;
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
		// remove(index),remove("vinoth")
		
		mentors.remove(4);
		System.out.println("<--after removing the data from the list --->");
		System.out.println(sizeOfMentors);
		//4
		System.out.println(mentors);
		//[harrish, uday, vinoth, vineeth]
		
		//String string = mentors.get(1); []
		
		System.out.println(mentors.get(2));
		
		
		System.out.println("--------LinkedList-----------");
		
		List     <String>   mentors1 = new  LinkedList<String>();
		
		// node --> add or remove or replace the value from the list 
		mentors1.add("harrish");//true
		mentors1.add("uday");//true
		mentors1.add("vinoth");//true
		mentors1.add("vineeth");//true
		mentors1.add("muthu");//false
		
		// removeAll(collection)
		//mentors1.removeAll(mentors);
		mentors1.clear();
		
		System.out.println(mentors1);
		
		
		boolean checkValueInArrayList = mentors.contains("vineeth");
		
		System.out.println(checkValueInArrayList);
		
		
		
		//mentors.remove(sizeOfMentors)
		//LIFO
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

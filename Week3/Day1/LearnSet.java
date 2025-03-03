package week3.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		
		// interface  Nameoftheset 
		
		Set<String>  learnersName = new  HashSet<String>();
		//random order
		learnersName.add("vinida");
		learnersName.add("shreen");
		learnersName.add("fleena");
		learnersName.add("indhu");
		learnersName.add("preethi");
		learnersName.add("vinida");
		
		System.out.println("----hashset-------");
		System.out.println(learnersName);
		
		Set<String>  learnersName1 = new  TreeSet<String>();
		//ASCCI order 
		learnersName1.add("vinida");
		learnersName1.add("shreen");
		learnersName1.add("fleena");
		learnersName1.add("indhu");
		learnersName1.add("preethi");
		learnersName1.add("vinida");
		
		System.out.println("----tresset-------");

		System.out.println(learnersName1);
		
		
		Set<String>  learnersName2 = new  LinkedHashSet<String>();
		//Insertion order 
		learnersName2.add("vinida");
		learnersName2.add("shreen");
		learnersName2.add("fleena");
		learnersName2.add("indhu");
		learnersName2.add("preethi");
		learnersName2.add("vinida");
		
		System.out.println("----Linkedhashset-------");

		System.out.println(learnersName2);
		
		System.out.println("----gettingTheSet-------");
		
		
		List<String> gettingTheSet = new ArrayList<String>(learnersName2);
		
		// it will print the data after the sorting the values 
		Collections.sort(gettingTheSet);
		String retievingTheData = gettingTheSet.get(4);
		System.out.println(retievingTheData);
		
		
		//tradition for loop --> (int , cond , iter)
		//for each (Datatype varname : CollectionObjectName)
		
		
		System.out.println("-------------Retrieving using the for each loop----------");
		
		for (String linkHastsetData : learnersName2) {
			
			System.out.println(linkHastsetData);
		}
		
		
		
		
		
	}

}

package week6.day4;

import com.github.javafaker.Faker;

public class LearnFaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faker fake = new Faker();
		
		System.out.println(fake.company().name());
		System.out.println(fake.company().name());
		System.out.println(fake.name().firstName());
		System.out.println(fake.name().firstName());
		System.out.println(fake.name().lastName());
		String email= fake.name().firstName()+"."+fake.name().lastName()+"@gmail.com";
		
		System.out.println("email address : "+ email);

	}

}

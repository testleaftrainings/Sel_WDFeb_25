package week4.day2;

import org.testng.annotations.Test;

public class LearnTestNG {
    @Test // scenario 1: pass ->Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
	public void runAsTestNG() {
		System.out.println("Introduction to TestNG-test no 1");

	}
    @Test(dependsOnMethods = {"runAsTestNG"})// should only run , if my test 1 is success
    // scenario 1: if my 1st test is failed means ---> Total tests run: 1, Passes: 0, Failures: 1, Skips:1 
   	public void runAsTestNGOne() {
   		System.out.println("Introduction to TestNG");

   	}


}

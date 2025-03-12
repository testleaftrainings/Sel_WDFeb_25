package week4.day3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class LearnAnnotation {
  @Test(priority = -1,dataProvider = "dp")
  public void demoRun(Integer n, String s) {
	  System.out.println("Tc -1 data-->"+n+"/"+s );

  }
  @Test(priority = 0)
  public void runLogin() throws Exception {
	  System.out.println("login is success");
	  throw new Exception();
}
  @Test(priority = 1,invocationCount =3 ,threadPoolSize = 2)
  // threadpoolsize>ic  ->scenario:1
  // ic>threadpoolsize  ->scenario:2
  
  public void runCreateLead() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("createLead module is success");
	  

}
  @Test(dependsOnMethods = {"runLogin"},alwaysRun = true )
  public void runCreateAccount() {
	  System.out.println("Delete Lead module is success");

}
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("beforMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }


  @DataProvider
  public Object[][] dp() {
	  System.out.println("data provider executed here");
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}

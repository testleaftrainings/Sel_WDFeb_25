package week6.day2;

public class LearnEncapsulation {
	
	private String browserName;
	
	private  final static ThreadLocal<String> browser = new ThreadLocal<String>();
	
	public String getBrowserName() {
		return browserName;
	}
	
	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}
	
	
	

	public static void main(String[] args) {
		
LearnEncapsulation le = new LearnEncapsulation();
le.setBrowserName("chrome");
System.out.println(le.getBrowserName());

browser.set("Edge");
System.out.println(browser.get());
 
	}

}

package week6.day2;

public class LearnThread extends Thread {
	
	
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			System.out.println(Thread.currentThread().getName()+" opened using this thread");
			
		}
	}

}

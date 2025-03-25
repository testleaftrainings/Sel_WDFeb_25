package week6.day2;

public class ExThread {

	public static void main(String[] args) {
		LearnThread lt1 = new LearnThread();
		LearnThread lt2 = new LearnThread();
		
		lt1.start();
		lt2.start();

	}

}

package week2.day3;

public class SciCal extends Calculator {
	
	@Override
	public void addNum() {
		
//		float e,f,g;
//		e= 1.2f;
//		f=3.4f;
//		g=e+f;
//		System.out.println(g);
		super.addNum();
	}

	public static void main(String[] args) {
		SciCal scc = new SciCal();
		scc.addNum();


	}

}

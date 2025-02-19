package WeekOneDayThree;

public class RectangleSimpleWay {
	
	int len, bre, ht, vol;
	
	// ()--> we gonna implement the parameterization
	// argument - variable declarization
	public int calVolume(int l,int b, int h) {		
		// initialization
		len=l;
		bre=b;
		ht=h;	
		vol = len * bre * ht;
		return vol;
	}

	public static void main(String[] args) {
		
		RectangleSimpleWay rsw = new RectangleSimpleWay();
		System.out.println("Volume of the rectangle "+rsw.calVolume(75, 32, 30));


		RectangleSimpleWay rsw1 = new RectangleSimpleWay();
		int calVolume = rsw1.calVolume(2,5,7);
		System.out.println("Volume of the rectangle "+calVolume);
		
		

	}

}

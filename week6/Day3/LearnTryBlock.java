package week6.day3;

public class LearnTryBlock {

	public static void main(String[] args) throws Exception {
		try {
//			int c = 100/0;// ans-->0  ||java.lang.ArithmeticException
//			System.out.println(c);
			
//			int [] arr1= {2,3,5};
//			System.out.println(arr1[4]);
			//throws :: throw
			throw new NullPointerException();		
		} catch (ArithmeticException e) {
			System.out.println("This way of mathemathical operation is not allowed in the java");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The Index which you opted for is not within the range of the Array");
		}
		catch (NullPointerException e) {
			System.out.println("This exception has been forcifully displayed by Throw keyword");
		}
		finally {
			System.out.println("Finally Block will get executed atleast once");
		}
	}

}

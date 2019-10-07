
public class MainCode {
	public static void main (String[] args){
		
		int Result;
		
		try {
			Result = 4/0;
			
			System.out.println("Result : " + Result);
		}
		catch (ArithmeticException E) {
			System.out.println("Can't divide by 0");
		}
	}
}

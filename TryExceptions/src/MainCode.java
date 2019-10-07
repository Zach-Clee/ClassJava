
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
		catch(Exception E){
			System.out.println("Unforseen error.");
		}
		
		
		//creating own exception
		NationwideAccounts ref = new NationwideAccounts();
		try {
			ref.NetSalary(2000, 1);
		}
		catch (AbsentiseException x) {
			System.out.println("Too many Absentise");
		}
		
		
	}
}

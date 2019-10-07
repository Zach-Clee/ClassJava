
public class MainClass {
	public static void main(String[] args) {
		Bank HSBC, NBS;
		HSBC = new Bank();
		NBS = new Bank();
		
		//Variable Dollar is static and therefore not created in the instance of an object.
		//Dollar is created as a variable and shared by all objects.
		Bank.Dollar = 200;
		HSBC.Amount(2);
		NBS.SetDollar(150);
		NBS.Amount(5);
	}
}

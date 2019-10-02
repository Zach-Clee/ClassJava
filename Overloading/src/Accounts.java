
public class Accounts {
	private int test = 0;
	public Accounts() {
		System.out.println("Your basic tax is + " + 21);
		test = 1;
		System.out.println(test);
	}
	public Accounts(int Salary) {
		float T= (float) Salary * 21 / 100;
		System.out.println("You Tax is : " + T);
	}
	
	public void echo() {
		System.out.println("Ah. So you find yourself here.");
	}
}

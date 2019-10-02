
public class Accounts {
	public void Tax() {
		System.out.println("Your basic tax is + " + 21);
	}
	public void Tax(int Salary) {
		float T= (float) Salary * 21 / 100;
		System.out.println("You Tax is : " + T);
	}
}

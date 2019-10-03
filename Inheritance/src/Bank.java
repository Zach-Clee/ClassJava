
class Bank {
	public void message() {
		System.out.println("Hello, you make it to Bank.message");
	}
	
	final public void CantOverrideThisMessage() {
		System.out.println("This message cant be overriden, as its final");
	}

	
}

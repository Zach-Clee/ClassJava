public class inheritance {
	public static void main (String[] args){
		
		Bank thisIsBank = new Bank();
		HSBC BankOverride = new HSBC();
		CallOnAbstract ChangeThis = new CallOnAbstract();
		
		
		//this calls a procedure 
		thisIsBank.message();
		thisIsBank.CantOverrideThisMessage();
		BankOverride.message();
		ChangeThis.ChangeThis();
		BankOverride.CantOverrideThisMessage();
		
		
		Parent1 x;
		x = new Child1();
		
		x.ParentMessage();
		
		
		
		String qwer= "hellothere";
		System.out.println(qwer.substring(2, 4));
	}
}

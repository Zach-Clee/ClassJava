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
		
		//------------------------------------------------------//		
		Parent1 x;
		x = new Child1();
		
		x.ParentMessage();
		//------------------------------------------------------//
		
		MyMath Ref = new MyMath();
		doMath(Ref);
	}
	
	public static void doMath(Math56 M) {
		M.Add(5, 7);
		M.Sub(6, 2);
	}
}

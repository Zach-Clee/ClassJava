
class Bank {
	int x;
	static int Dollar;
	
	public void SetDollar(int a) {
		Dollar = a;
	}
	
	public void Amount(int b) {
		System.out.println(b* Dollar);
	}
}

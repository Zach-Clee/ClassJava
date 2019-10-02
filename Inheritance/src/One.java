class One extends Other {
	public void hello(){
	//test is a variable inherited from Other class.
	test = 20;
	
	System.out.println("This is an extended class" + test);
	
	}
	
	
	//this overrights the proceedure in Other. Purpose of inheritance is to add funcationality, or change it.
	public void that() {
		System.out.println("<<<<<<<<<<<<<<<<<changed");
	}
	
	
	
}

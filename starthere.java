import static java.lang.System.out;

class starthere{
	public static void main (String[] dull){

		int bill = 271;
		int remaining = bill;
		int[] intArray = new int[] {50,20,10,5,2,1};
		// (2) print the java int array
		for (int i=0; i<intArray.length; i++)
		{
  			if ((bill % intArray[i] >= 0) && (bill % intArray[i] != bill)){
  				int sumToRemove = intArray[i] * (bill / intArray[i]);
  				int result  =bill / intArray[i];
  				bill -= sumToRemove;
  				z("£" + (intArray[i]) + " x " + result);
  			}
		}
	}

	public static void z (String input){
		out.println(input);
	}
}

class NationwideAccounts {
	public void NetSalary(int salary, int absents) throws AbsentiseException{
		float Tax =0, Net = 0;
		if (absents > 5) {
			AbsentiseException E1 = new AbsentiseException();
			throw E1;
		}
		Tax = salary * 21 / 100;
		Net = salary - Tax;
		System.out.println("Net salary is :" + salary);
	}
}

class AbsentiseException extends Exception{}

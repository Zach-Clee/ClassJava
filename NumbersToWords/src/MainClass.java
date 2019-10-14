

		//Aim is 9000
public class MainClass {
	public static void main (String[] args) {
		String Numbers = "1986";

		if (Numbers.length() == 4) {
			signeldigits(Numbers.substring(0, 1));
			System.out.print(" thousand ");
			signeldigits(Numbers.substring(1, 2));
			System.out.print(" hundred ");
			int value = Integer.parseInt(Numbers.substring(2, 3));
			if (value == 1) {
				TenSomething(Numbers.substring(2, 3));
			} else { 
				doubleDigits(Numbers.substring(2, 3));
				signeldigits(Numbers.substring(3, 4));
			}
		}
		
		else if (Numbers.length() == 3) {
			signeldigits(Numbers.substring(0, 1));
			System.out.print(" Hundred ");
			int value = Integer.parseInt(Numbers.substring(0, 1));
			if (value == 1) {
				TenSomething(Numbers.substring(1, 2));
			} else { 
				doubleDigits(Numbers.substring(1, 2));
				signeldigits(Numbers.substring(2, 3));
			}
			
			
		} else if (Numbers.length() == 2) {
			int value = Integer.parseInt(Numbers.substring(0, 1));
			if (value == 1) {
				TenSomething(Numbers.substring(1, 2));
			} else { 
				doubleDigits(Numbers.substring(0, 1));
				signeldigits(Numbers.substring(1, 2));
			}
		} else if (Numbers.length() <= 1) {
			signeldigits(Numbers);
		} else {
			System.out.println("No number");
		}
		
	}
	
	public static void doubleDigits(String num) {
		switch (num) {
		case "2": System.out.print("Twent ");
		break;
		case "3": System.out.print("Thirty ");
		break;
		case "4": System.out.print("Fourty ");
		break;
		case "5": System.out.print("Fifty ");
		break;
		case "6": System.out.print("Sixty ");
		break;
		case "7": System.out.print("Seventy ");
		break;
		case "8": System.out.print("Eigthy ");
		break;
		case "9": System.out.print("Ninety ");
		break;
	}
	}
	
	public static void TenSomething(String num) {
			switch (num) {
			case "0": System.out.print("Ten");
			break;
			case "1": System.out.print("Eleven");
			break;
			case "2": System.out.print("Twelve");
			break;
			case "3": System.out.print("Thriteen");
			break;
			case "4": System.out.print("Fourteen");
			break;
			case "5": System.out.print("Fiveteen");
			break;
			case "6": System.out.print("Sixteen");
			break;
			case "7": System.out.print("Seventeen");
			break;
			case "8": System.out.print("Eightteen");
			break;
			case "9": System.out.print("Nineteen");
			break;
			}
		}
	
	public static void signeldigits(String num) {
		switch (num) {
		case "0": System.out.print("");
		break;
		case "1": System.out.print("one");
		break;
		case "2": System.out.print("two");
		break;
		case "3": System.out.print("three");
		break;
		case "4": System.out.print("four");
		break;
		case "5": System.out.print("five");
		break;
		case "6": System.out.print("six");
		break;
		case "7": System.out.print("seven");
		break;
		case "8": System.out.print("eigth");
		break;
		case "9": System.out.print("nine");
		break;
		}
	}
}


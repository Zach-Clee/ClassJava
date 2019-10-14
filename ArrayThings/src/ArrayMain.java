
public class ArrayMain {

	public static void main(String[] args) {
		int num1, num2;
		float result = 0;
		String sign;
		
		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[2]);
			sign = args[1];
			
			if (sign.equals("+")) result = num1 + num2;
			else if (sign.equals("-")) result = num1 - num2;
			else if (sign.equals("x")) result = num1 * num2;
			else if (sign.equals("/")) result = num1 / num2;
			else System.out.println("Error, insert a mathematical operator");
			System.out.println("Result is: " + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please insert the correct number of values");
		} catch(ArithmeticException e) {

			System.out.println("Please insert 2 numerical numbers");
		} catch (NumberFormatException e) {
			System.out.println("Please insert 2 number and one operation only");
		}

		
		
		
		
		int Numbers[] = {15, 26, 43, 3, 1};
		int maxValue = Numbers[0];
		for (int i = 1; i < Numbers.length; i++) {
			if (maxValue < Numbers[i]) {
				maxValue = Numbers[i];
			}
		}
		System.out.println("Highest is : " + maxValue);
	}

}

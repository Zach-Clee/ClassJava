
public class DigitToWorld {

	public static void main(String[] args) {
		
	int num = 1593;	
		
	String One[] = {" ", "One", "Two",  "Three",  "Four",  "Five",  "Six",  "Seven",  "Eight",  "Nine",  "Ten",  "Eleven",  "Twelve"
			,  "Thirteen",  "Fourteen",  "Fivteen",  "Sixteen",  "Seventeen",  "Eighteen",  "Nineteen"};
	
	String TY[] = {"", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eigthy", "Ninety"};

	String Result="";
	
	if (num == 1000) {
		Result += One[num/1000]+" thousand ";
		num %= 1000;
	} 
	
	
	if(num >=100) {
		Result+= One[num/100]+" hundred ";
		num %= 100;
	}
	
	if (num >= 20) {
		Result += TY[num/10];
		num %= 10;
	}
	if (num >= 1) {
		Result+=One[num];
	}
	
	System.out.println(Result);
	
	}


}

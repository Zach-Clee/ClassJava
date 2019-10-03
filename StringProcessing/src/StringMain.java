
public class StringMain {
	public static void main (String[] args) {
		StringProcessing str = new StringProcessing();
		//str.PrintVertical("Hello my friends");
		//str.wordCount("Hello my friends");
		//str.PrintVertical2("Hello my friends");
		//str.reverseVertical("Hello my friends");
		str.find("I am, am going am", "am");
	}
	
}


class StringProcessing {
	public void PrintVertical(String msg) {
		int i;
		for (i = 0; i<msg.length(); i++) {
			System.out.println(msg.substring(i,i+1));
		}
	}
	
	public void wordCount (String msg) {
		int spacecount = 0;
		String alpha;
		int i =0;
		
		for (i = 0; i<msg.length();i++) {
			alpha = msg.substring(i, i + 1);
			if (alpha.equals(" ")) {
				++spacecount;
			}
		}
		System.out.println("We have " + (spacecount+1) + " words");
	}
	
	public void PrintVertical2(String msg) {
		String word, alpha;
		word = "";
		int i = 0;
		for (;i<msg.length();i++) {
			alpha = msg.substring(i, i + 1);
			if (alpha.equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word += alpha;
			}
		}
		System.out.println(word);
	}
	
	public void reverseVertical(String msg) {
		String word, alpha;
		word = "";
		
		
		
		String[] ary = msg.split(" ");
		System.out.println(ary[1]);
		
		
		int i = msg.length() -1;
		System.out.println(i);
		for (;i >= 0;i--) {
			alpha = msg.substring(i, i + 1);
			if (alpha.equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word = alpha + word;
			}
		}
		System.out.println(word);
	}
	
	public void find(String msg, String lookfor) {
		int lookForLength = lookfor.length();
		int count = 0;
		String alpha = "";
		
		System.out.println("Look for is " + lookForLength);
		
		System.out.println("msg is : " + msg.length());
		
		
		for (int i = 0; i <= (msg.length()-lookForLength); i++) {
			alpha = msg.substring(i, i+ lookForLength);
			
		
		if (alpha.equals(lookfor)){
			++count;
		}

		}
		System.out.println(lookfor + " appears " + count + " times.");
	}
}

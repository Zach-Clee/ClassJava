
public class StringMain {
	public static void main (String[] args) {
		StringProcessing str = new StringProcessing();
		//str.PrintVertical("Hello my friends");
		//str.wordCount("Hello my friends");
		//str.PrintVertical2("Hello my friends");
		//str.reverseVertical("Hello my friends");
		//str.find("hello LondonLondon, I am going to London", "London");
		str.countTheWords("Hello my friend how are yoooooooou"); 
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
		int count = 0;
		String alpha = "";
		msg = msg.toLowerCase();
		lookfor = lookfor.toLowerCase();
		
		for (int i = 0; i <= (msg.length()-lookfor.length()); i++) {
			alpha = msg.substring(i, i+ lookfor.length());
			if (alpha.equals(lookfor)){
				++count;
				i += lookfor.length() -1;
			}
		}
		System.out.println(lookfor + " appears " + count + " times.");
	}
	
	
	public void countTheWords(String msg) {
		
		String alpha = "";
		String word = "";
		int longestwordValue = 0;

		for (int i = 0; i <= msg.length() -1; i++) {
			alpha = msg.substring(i, i + 1);
			if (alpha.equals(" ")) {
				if (word.length() > longestwordValue) {
					longestwordValue=word.length();
				}
				word = "";
			} else {
				word += alpha;
			}
		}
		if (word.length() > longestwordValue) {
			longestwordValue=word.length();
		}
		System.out.println("Longest word is : " + longestwordValue);
	}
	
}

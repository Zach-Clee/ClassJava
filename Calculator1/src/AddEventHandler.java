import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEventHandler  implements ActionListener{
	TextField Screen;

	int result;
	public AddEventHandler (TextField T1) {
		Screen = T1;
	}
	public void actionPerformed(ActionEvent E) {
		String Flag= " ";
		Button Btn;
		Btn = (Button)E.getSource();
		String Sign = Btn.getLabel();
		
		if (Sign.equals("+")) {
			Flag = "+";
			result += Integer.parseInt(Screen.getText());
			System.out.println("hello" + result);
		}
		
		if (Sign.equals("-")) {
			Flag = "-";
			result -= Integer.parseInt(Screen.getText());
			System.out.println("hello" + result);
		}
		
		if (Sign.equals("/")) {
			Flag = "/";
			result /= Integer.parseInt(Screen.getText());
			System.out.println("hello" + result);
		}
		
		if (Sign.equals("*")) {
			Flag = "*";
			result *=  Integer.parseInt(Screen.getText());
			System.out.println("hello" + result);
		}
		
		if (Sign.equals("=")) {			
			Screen.setText(Integer.toString(result));
		}
		
		if (Sign.equals("C")) {
			Screen.setText("");
		}
	}
}

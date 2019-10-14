import java.awt.event.*;
import java.awt.*;

public class addNumberEventHandler implements ActionListener{
	
	TextField Screen;
	public addNumberEventHandler (TextField T1) {
		Screen = T1;
	}
	
	public void actionPerformed(ActionEvent E) {
		Button Btn;
		Btn = (Button)E.getSource();
		String Sign = Btn.getLabel();
		String currentString = Screen.getText();
		switch (Sign) {
		
		case "0": 
			currentString += "0";
			Screen.setText(currentString);
			break;
		case "1": 
			currentString += "1";
			Screen.setText(currentString);
			break;
		case "2":
			currentString += "2";
			Screen.setText(currentString);
			break;
		case "3":
			currentString += "3";
			Screen.setText(currentString);
			break;			
			
		case "4":
			currentString += "4";
			Screen.setText(currentString);
			break;			
			
		case "5":
			currentString += "5";
			Screen.setText(currentString);
			break;			
			
		case "6":
			currentString += "6";
			Screen.setText(currentString);
			break;			
			
		case "7":
			currentString += "7";
			Screen.setText(currentString);
			break;			
			
		case "8":
			currentString += "8";
			Screen.setText(currentString);
			break;		
			
		case "9":
			currentString += "9";
			Screen.setText(currentString);
			break;		
			
		}
	}
}


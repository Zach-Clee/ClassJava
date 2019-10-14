package playingWithFrames;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddEventHandler implements ActionListener{
	
	TextField Txt1, Txt2, Txt3; Label Error;
	
	public AddEventHandler (TextField T1, TextField T2, TextField T3, Label Error1) {
		Txt1 = T1;
		Txt2 = T2;
		Txt3 = T3;
		Error = Error1;
	}
	public void actionPerformed(ActionEvent E) {
		int No1, No2, Result;
		try{
			No1 = Integer.parseInt(Txt1.getText());
			No2 = Integer.parseInt(Txt2.getText());
			Result =  No1 + No2;
			Txt3.setText(Integer.toString(Result));
			
		} catch (NumberFormatException NFE) {
			Error.setText("Digits only please");
		}
		
		
		/* Button Btn;
		 * Btn = (Button)E.getSource();
		 * String Sign = Btn.getLable();
		 * if(sign.equals("+")){
		 * result = a+b;
		 * 
		 */
		
	}
	
}
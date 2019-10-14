import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MainCode {

	public static void main (String[] args) {		
		Frame F = new Frame("Main");
		Button Add = new Button("+");
		Button Minus = new Button("-");
		Button Multi = new Button("x");
		Button Div = new Button ("/");
		TextField FirstNo = new TextField("");;
		TextField SecondNo = new TextField("");
		TextField Result = new TextField();
		Label L1 = new Label("First No.");
		Label L2 = new Label("Second No.");
		Label L3 = new Label("Results");
		F.setLayout(new GridLayout(1,10));
		
		F.add(L1);
		F.add(FirstNo);
		F.add(L2);
		F.add(SecondNo);
		F.add(Add);
		F.add(Minus);
		F.add(Multi);
		F.add(Div);
		F.add(L3);
		F.add(Result);

		F.setVisible(true);
		F.setSize(900,300);
		
		//Class not created, items are created when button is selected.
		Add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent J){
				Result.setText((Integer.toString(Integer.parseInt(FirstNo.getText()) + Integer.parseInt(SecondNo.getText()))));
				
			}
		});
		
		Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent J) {
				Result.setText((Integer.toString(Integer.parseInt(FirstNo.getText()) - Integer.parseInt(SecondNo.getText()))));
			}
		});
		
		Multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent J) {
				Result.setText((Double.toString(Double.parseDouble(FirstNo.getText()) * Double.parseDouble(SecondNo.getText()))));
			}
		});
		
		Div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent J) {
				Result.setText((Double.toString(Double.parseDouble(FirstNo.getText()) / Double.parseDouble(SecondNo.getText()))));
			}
		});
	}
}

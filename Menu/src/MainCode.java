import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainCode {
	public static void main (String[] args) {
		Frame F = new Frame("Main");
		F.setVisible(true);
		F.setSize(300,300);
		Button Addition = new Button("Addition");
		Button Subtraction = new Button("Subtraction");
		Button Multiplication = new Button("Multiplication");
		Button Division = new Button ("Division");
		F.setLayout(new GridLayout(4,1));
		F.add(Addition);
		F.add(Subtraction);
		F.add(Multiplication);
		F.add(Division);	
		
		FrameTemplate temp = new FrameTemplate();
		
		Addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent X) {
				temp.F.setTitle("Addition");
				temp.Button1.setLabel("Addition");
				temp.F.setVisible(true);
			}
		});
		
		Subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent X) {
				temp.F.setTitle("Subtraction");
				temp.Button1.setLabel("Subtraction");
				temp.F.setVisible(true);
			}
		});
		
		Multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent X) {
				temp.F.setTitle("Multiplication");
				temp.Button1.setLabel("Multiplication");
				temp.F.setVisible(true);
			}
		});
		
		Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent X) {
				temp.F.setTitle("Division");
				temp.Button1.setLabel("Division");
				temp.F.setVisible(true);
			}
		});
	}
}


class FrameTemplate{
	Frame F = new Frame("Main");
	Button Button1 = new Button();
	TextField No1, No2, Results;
	public FrameTemplate(){
		No1 = new TextField();
		No2 = new TextField();
		Results = new TextField();
		F.setLayout(new GridLayout(4,2));
		
		F.setSize(300,300);
		F.add(new Label("First No."));
		F.add(No1);
		F.add(new Label("Second No."));
		F.add(No2);
		F.add(new Label());
		F.add(Button1);
		F.add(new Label("Results"));
		F.add(Results);
		
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Button1.getLabel() == "Addition" ) {
			 Results.setText(Integer.toString((Integer.parseInt(No1.getText())) + (Integer.parseInt(No1.getText()))));
				}else if (Button1.getLabel() == "Subtraction" ) {
					 Results.setText(Integer.toString((Integer.parseInt(No1.getText())) - (Integer.parseInt(No1.getText()))));
				}else if (Button1.getLabel() == "Multiplication" ) {
					 Results.setText(Float.toString((Float.parseFloat(No1.getText())) * (Float.parseFloat(No1.getText()))));
				}else{
					 Results.setText(Float.toString((Float.parseFloat(No1.getText())) / (Float.parseFloat(No1.getText()))));
				}
			}
		});
	}
}

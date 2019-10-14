package playingWithFrames;

import java.awt.*;

public class MainClass {
	public static void main(String[] args) {
		Frame F = new Frame();

		TextField T1 = new TextField(10);
		TextField T2 = new TextField(10);
		TextField T3 = new TextField(10);

		Label L1 = new Label();
		Label L2 = new Label();
		Label L3 = new Label();
		Label Error = new Label();
		
		Error.setSize(20,20);
		Button btn1 = new Button("+");
		Button btn2 = new Button("-");
		Button btn3 = new Button("*");
		Button btn4 = new Button("%");
		
		FlowLayout Flow = new FlowLayout();
		
		
		F.setLayout(Flow);
		AddEventHandler Plus = new AddEventHandler(T1, T2, T3, Error);
		SubEventHandler Sub = new SubEventHandler(T1, T2, T3, Error);
		MultiplierEventHandler Multi = new MultiplierEventHandler(T1, T2, T3, Error);
		DivideEventHandler Div = new DivideEventHandler(T1, T2, T3, Error);
		
		btn1.addActionListener(Plus);
		btn2.addActionListener(Sub);
		btn3.addActionListener(Multi);
		btn4.addActionListener(Div);
		
		
		//F.add(btn1,BorderLayout.NORTH);
		F.add(L1);
		F.add(T1);
		F.add(L2);
		F.add(T2);
		
		F.add(btn1);
		F.add(btn2);
		F.add(btn3);
		F.add(btn4);
		
		F.add(L3);
		F.add(T3);
		F.add(Error);
		
		F.setVisible(true);
		F.setSize(500, 500);
		
	}
}
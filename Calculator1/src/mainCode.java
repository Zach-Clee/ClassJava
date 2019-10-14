import java.awt.*;


public class mainCode {

	public static void main (String[] args) {
		Frame F = new Frame("3D Calculator");
		
		Panel P1 = new Panel();
		Panel P2 = new Panel();
		GridLayout G1 = new GridLayout(4,4);
		P2.setLayout(G1);
		
		TextField Screen;
		Button B0, B1, B2, B3, B4, B5, B6, B7, B8 ,B9;
		Button ADD, SUB, MUL, DIV, CLEAR, EQUALS;
		Screen = new TextField(20);
		B0 = new Button("0");
		B1 = new Button("1");
		B2 = new Button("2");
		B3 = new Button("3");
		B4 = new Button("4");
		B5 = new Button("5");
		B6 = new Button("6");
		B7 = new Button("7");
		B8 = new Button("8");
		B9 = new Button("9");
		ADD = new Button("+");
		SUB = new Button("-");
		MUL = new Button("*");
		DIV = new Button("/");
		CLEAR = new Button("C");
		EQUALS = new Button("=");
		
		P1.add(Screen);
		P2.add(B0);
		P2.add(B1);
		P2.add(B2);
		P2.add(ADD);
		P2.add(B3);
		P2.add(B4);
		P2.add(B5);
		P2.add(SUB);
		P2.add(B6);
		P2.add(B7);
		P2.add(B8);
		P2.add(MUL);
		P2.add(B9);
		P2.add(DIV);
		P2.add(CLEAR);
		P2.add(EQUALS);
		
		F.add(P1, BorderLayout.NORTH);
		F.add(P2, BorderLayout.CENTER);
		F.setSize(400,400);
		F.setVisible(true);
		
		addNumberEventHandler addNumber = new addNumberEventHandler(Screen);
		B0.addActionListener(addNumber);
		B1.addActionListener(addNumber);
		B2.addActionListener(addNumber);
		B3.addActionListener(addNumber);
		B4.addActionListener(addNumber);
		B5.addActionListener(addNumber);
		B6.addActionListener(addNumber);
		B7.addActionListener(addNumber);
		B8.addActionListener(addNumber);
		B9.addActionListener(addNumber);
		
		AddEventHandler Add = new AddEventHandler(Screen);
		ADD.addActionListener(Add);
		SUB.addActionListener(Add);
		MUL.addActionListener(Add);
		DIV.addActionListener(Add);
		CLEAR.addActionListener(Add);
		EQUALS.addActionListener(Add);
	}
}
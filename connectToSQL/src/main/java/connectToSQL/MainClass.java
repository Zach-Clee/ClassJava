package connectToSQL;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.sql.*;

public class MainClass {
	public static void main(String[] args) {

			String regNo, name, marks, empty;
			regNo = "";
			name = "";
			marks = "";
			empty = "";
			
			Frame F = new Frame("SQL Connector");
			Panel P1 = new Panel();
			GridLayout G1 = new GridLayout(4,2);
			P1.setLayout(G1);
			
			Label regNoLabel = new Label("Reg No.");
			Label nameLabel = new Label("Name");
			Label marksLabel = new Label("Marks");
			Label emptyLabel = new Label("");
			
			TextField regNoTextBox;
			TextField nameTextBox;
			TextField marksTextBox;
			regNoTextBox = new TextField(50);
			nameTextBox = new TextField(50);
			marksTextBox = new TextField(50);
			Button Save = new Button("Save");
			
			
			P1.add(regNoLabel);
			P1.add(regNoTextBox);
			P1.add(nameLabel);
			P1.add(nameTextBox);
			P1.add(marksLabel);
			P1.add(marksTextBox);
			P1.add(emptyLabel);
			P1.add(Save);			
			
			F.setVisible(true);
			F.setSize(400,400);
			F.add(P1, BorderLayout.CENTER);

			SaveEventHandler SaveInfo = new SaveEventHandler(regNoTextBox,nameTextBox,marksTextBox,regNo, name, marks);
			Save.addActionListener(SaveInfo);


	}
}

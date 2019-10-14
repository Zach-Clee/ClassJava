package connectToSQL;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEventHandler implements ActionListener{

		TextField regNoTextBox;
		TextField nameTextBox;
		TextField marksTextBox;
		String regNoVar;
		String name;
		String marksVar;
		
		
		int result;
		public SaveEventHandler (TextField regNoTxTInput, TextField nameTxTInput, TextField marksTxTInput, String regNo, String name, String mark) {
			regNoTextBox = regNoTxTInput;
			nameTextBox = nameTxTInput;
			marksTextBox = marksTxTInput;
		}
		public void actionPerformed(ActionEvent E) {
			regNoVar =regNoTextBox.toString();
			name = nameTextBox.toString();
			marksVar = marksTextBox.toString();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/nationwide", "root", "qwerty123!");
			Statement State = Con.createStatement();
			State.executeUpdate("insert into tdp values('"+name+"')");
			
			
			
			System.out.println(name);
		} catch (Exception e) {
			System.out.print(e.toString());
			System.out.println(name.length());
		}
			
			
		}
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class MainCode {
		static Connection Con;
		static Statement S;
		
		static {
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/nationwide", "root", "qwerty123!");
			Statement S = Con.createStatement();

			
			ResultSet Rs = S.executeQuery ("Select * from TDP");
			
			while(Rs.next()) {
				System.out.println(Rs.getString(1));
			}
			
		} catch (Exception e) {
			System.out.println("out of records");
			System.out.println(e);
			
		}
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	
}

}

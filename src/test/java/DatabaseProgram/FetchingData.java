package DatabaseProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;
@Test
public class FetchingData {
	
	public void test1() throws SQLException {
		
	Driver d=new Driver();
	DriverManager.registerDriver(d);
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject", "root", "root");
	Statement st=con.createStatement();
	
	int value=st.executeUpdate("Update students SET Subjects='physics' where branch='cse'");
	ResultSet s=st.executeQuery("SELECT * FROM students");
	while(s.next()) {
		String data=s.getString(1);
		System.out.println(data);
	}
	con.close();
	}

}

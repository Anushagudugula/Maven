package mavenpractice;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider= "getData")
	public void setData(String username , String password)
	
	{
	System. out.println("you have provided username as:" +username ); 
	System. out.println("you have provided password as:" +password);
	}
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
	
	Object[][] data = new Object[3][2];
	
	data[0][0] ="sampleuser1" ; 
	data[0][1] = "abcdef";
	
	data[1][0] ="testuser2";
	data[1][1] = "zxcvb";
	
	data[2][0] ="guestuser3"; 
	data[2][1] = "pass123";
	return data;
	}
	}



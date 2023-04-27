package mavenpractice;

import org.testng.annotations.Test;

public class dependsonmethod {
@Test()
public void createUser() {
}
@Test()
public void searchUser() {
	
}
@Test(dependsOnMethods = "searchUser")
public void deleteUser() {
	System.out.println("deleteUser");
}
}
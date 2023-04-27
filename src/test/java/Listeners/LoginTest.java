package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void loginByEmail() {
		System.out.println("Login by Email");
		Assert.assertEquals("anusha", "anusha");
	}
	@Test
	public void Facebook() {
		System.out.println("Login facebook");
		Assert.assertEquals("anu", "sha");
	}

}

package mavenpractice;

import org.testng.annotations.Test;

public class Invocationcount {
	@Test(invocationCount = 5)
	public void deposit() {
		System.out.println("deposit successfully");
	}
	@Test(enabled = false)
	public void withdraw() {
		System.out.println("with draw successfully");
	}
	@Test(invocationCount = 3)
	public void checkbalance() {
		System.out.println("Balance is 0");
	}

}

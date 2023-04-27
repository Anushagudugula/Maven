package mavenpractice;

import org.testng.annotations.Test;

public class Grouping {
@Test(groups= {"smokeTest", "functionalTest"})

public void setup() {
	System.out.println("logged successfully");
	}


@Test(groups= {"functionalTest"})
public void testcase2() {
	System.out.println("Mail sent");
}
}
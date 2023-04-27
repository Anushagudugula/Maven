package mavenpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class multipleparalleltesting {
	WebDriver driver=null;
	
	@Parameters("BrowserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser name is : "+browserName);
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
}


else if (browserName.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\geckodriver.exe");
	 driver=new FirefoxDriver();
}

	}
	@Test
	public void test() throws InterruptedException {
		driver.get("https://google.com/");
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("test completed successfully");
	}
}

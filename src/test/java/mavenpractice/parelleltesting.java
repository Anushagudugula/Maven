package mavenpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parelleltesting {
	WebDriver driver;
	@Test
	public void test() throws InterruptedException {
		System.out.println("excute test");
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='avatar mx-auto white']")).click();
		driver.close();
	}
	@Test
public void test1() throws InterruptedException {
	System.out.println("excute test1");
	
	System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://google.com");
	WebElement web=driver.findElement(By.xpath("//*[@title='Search']"));
	web.sendKeys("demoqa.com says");
	Thread.sleep(2000);
	driver.close();

}
}

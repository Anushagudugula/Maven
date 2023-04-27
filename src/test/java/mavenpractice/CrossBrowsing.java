package mavenpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsing {
WebDriver driver;

@Parameters("Browser")
@Test()
public void setup(String browser) {
	System.out.println("the browser is="+browser);
	
	if(browser.equalsIgnoreCase("chrome")) {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else {
		System.out.println("your choosen a wrong browser");
	}
}
	@Test
    public void test() 
	{
    	driver.get("https://www.google.com/");
    	driver.findElement(By.xpath("//span[@class='gb_Sd']")).click();
    	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anushagudugula@gmail.com");
    	driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();
    }
	


}




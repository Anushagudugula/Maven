package mavenpractice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest { 
	WebDriver driver;
  @Test
  public void f() {
  }
  
 @BeforeMethod
  public void beforeMethod() {
	  driver.findElement(By.id("email")).sendKeys("anushagudugula@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("cri@12345");
	  driver.findElement(By.xpath("login")).click();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.xpath("lagout")).click();
  }

  @BeforeClass
  public void  beforeclass() {
	  System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
		  
	  }
}
  

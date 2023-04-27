package Reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.ProcessHandle.Info;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class CaptureSreenshotusingExtentReport {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		ExtentReports extentreport=new ExtentReports();
		File file=new File("F:\\selenium practice\\Maven\\ExtentReportsSreenshots.html");
		ExtentSparkReporter extentSpark=new ExtentSparkReporter(file);
		extentreport.attachReporter(extentSpark);
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String base64Code= captureSreenshot1();
		
		extentreport
		.createTest("Sreenshot test 1","this is for attaching the screenshot");
		.Info("this is simple msg")
		ad
		
		
		
		
	
			extentreport.flush();
		Desktop.getDesktop().browse(new File("F:\\selenium practice\\Maven\\ExtentReportsSreenshots.report").toURI());
	}
		public static String captureSreenshot1() {		TakesScreenshot st=(TakesScreenshot)driver;
		String base64Code=st.getScreenshotAs(OutputType.BASE64);	    
	    System.out.println("Sreenshot saved successfully");
	return base64Code;
	}
	
	public static String captureSreenshot(String fileName) {
		TakesScreenshot st=(TakesScreenshot)driver;
		File sourceFile=st.getScreenshotAs(OutputType.FILE);
	    File destFile=new File("F:\\Sreenshot");
	    try {
	    	FileUtils.copyFile(sourceFile, destFile);
	    } catch(IOException e) {
	    	e.printStackTrace();
	    }
	    System.out.println("Sreenshot saved successfully");
		return destFile.getAbsolutePath();
}

	private static void Info(String string) {
		// TODO Auto-generated method stub
		
	}

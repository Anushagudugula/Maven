package Reports;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GeneralExtentReports {
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void startReport() {
		
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("F:\\selenium\\ExtentReports\\report.html");
		htmlreport.config().setReportName("G");
		
		
		extent= new ExtentReports();
		extent.attachReporter(htmlreport);
		extent.setSystemInfo("Host Name", "LocalHost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("UserName", "Anu");
		
	}
	@Test
	public void demoReportPass() {
		test=extent.createTest("demoReports");
		Assert.assertTrue(false);
		test.log(Status.PASS, "Assert pass as condition is True");
	}
	@Test
	public void demoResultsFail() {
		test=extent.createTest("demoReports");
		Assert.assertTrue(false);
		test.log(Status.FAIL, "Assert pass as condition is false");
		
	}
	

@AfterMethod
public void endReport() {
	extent.flush();
}
}

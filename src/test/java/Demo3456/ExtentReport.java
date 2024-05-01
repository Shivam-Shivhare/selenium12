package Demo3456;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	ExtentSparkReporter createReport;
	ExtentReports createTest;
	ExtentTest createLog;
	@BeforeTest
	void Setup()
	{
		createReport=new ExtentSparkReporter("ProjectReport.html");
		createTest=new ExtentReports();
		createTest.attachReporter(createReport);
		
		createTest.setSystemInfo("OperatingSystem", "Window");
		createTest.setSystemInfo("Browser", "Chrome");
		createTest.setSystemInfo("Environment", "Testing");
		createTest.setSystemInfo("User Name", "Shivam Gupta");
		
		createReport.config().setDocumentTitle("MyprojectReportInfo");
		createReport.config().setReportName("Module-4-Reports");
		createReport.config().setTheme(Theme.DARK);

	}
	@Test
	void Test1()
	{
		createLog=createTest.createTest("Test1");
		createLog.log(Status.PASS,MarkupHelper.createLabel("test case pass",ExtentColor.GREEN));
	}
	@Test
	void Test2()
	{
		createLog=createTest.createTest("Test2");
		createLog.log(Status.FAIL,MarkupHelper.createLabel("test case fail",ExtentColor.RED));
	}
	void Test3()
	{
		createLog=createTest.createTest("Test3");
		createLog.log(Status.SKIP,MarkupHelper.createLabel("test case skip",ExtentColor.BLUE));
	}
	@AfterTest
	void close()
	{
		createTest.flush();
	}
}

	
	
		
	



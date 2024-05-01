package PraticeTest;

import java.io.IOException;

import org.testng.ITest;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent123 extends Testcase12 implements ITestListener{
	
	ExtentSparkReporter createReport;
	ExtentReports createTest;
	ExtentTest createLog;
	
	void setup()
	{
		createReport=new ExtentSparkReporter("MyProject11.html");
		createTest=new ExtentReports();
		createTest.attachReporter(createReport);
		
		createTest.setSystemInfo("OperatingSystem","window");
		createTest.setSystemInfo("Browser","chrome");
		createTest.setSystemInfo("Environment","Testing");
		createTest.setSystemInfo("Username","shivam gupta");
		
		createReport.config().setDocumentTitle("MyprojectInfo");
		createReport.config().setReportName("module-4-Reports");
		createReport.config().setTheme(Theme.STANDARD);
	}
	public void OnStart(ITest ContextResult)
	{
		setup();
		System.out.println("onstart call");
	}
	public void onFinish(ITest ContextResult)
	{
		createTest.flush();
		System.out.println("onfinish call");
	}
	public void OnTestStart(ITestResult Result)
	{
		
		System.out.println("onTeststart");
	}
	public void onTestSuccuss(ITestResult Result)
	{
		createLog=createTest.createTest(Result.getName());
		createLog.log(Status.PASS,MarkupHelper.createLabel("Test case pass",ExtentColor.GREEN));
	}
	public void onTestFailure(ITestResult Result) 
	{
		try {
			screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		createLog=createTest.createTest(Result.getName());
		createLog.log(Status.FAIL,MarkupHelper.createLabel("Test case fail",ExtentColor.RED));
		String path="C:\\Users\\admin\\eclipse-workspace\\newPro\\Screenshot\\hello1.png";
		createLog.addScreenCaptureFromPath(path);
	}
	public void onTestSkipped(ITestResult Result)
	{
		createLog=createTest.createTest(Result.getName());
		createLog.log(Status.SKIP,MarkupHelper.createLabel("Test case skipped",ExtentColor.YELLOW));
	}
}

	

		
	



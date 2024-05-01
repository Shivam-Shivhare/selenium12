package Demo3456;

import java.io.IOException;

import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AddListeners extends Testcase implements ITestListener {
	public void OnStart(ITest ContextResult)
	{
		System.out.println("onstart call");
	}
	public void onFinish(ITest ContextResult)
	{
		System.out.println("onfinish call");
	}
	public void onTestSuccuss(ITestResult Result)
	{
		System.out.println("Post:"+Result.getName());
	}
	public void onTestFailure(ITestResult Result) 
	{
		try {
			Screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult Result)
	{
		System.out.println("Post:"+Result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	{
		
	}


}

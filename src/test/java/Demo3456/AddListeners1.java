package Demo3456;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AddListeners1 extends Lisners123 implements ITestListener {
	public void OnStart(ITestContext Result)
	{
		System.out.println("OnStartcall");
	}
	public void OnFinish(ITestContext Result)
	{
		System.out.println("ontsrt test");
	}
	public void OnTestSuccess(ITestResult Result)
	{
		System.out.println("Post:"+Result.getName() );
	}
	public void OnTestFailure(ITestResult Result)
	{
		System.out.println("Post:"+Result.getName() );
	}
	public void OnTestSkipped(ITestResult Result)
	{
		System.out.println("Post:"+Result.getName() );
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	{
		
	}

}

package Demo3456;

import org.testng.annotations.Test;

public class Timeout12 {
	@Test(timeOut=200)
	void java() throws InterruptedException
	{
		Thread.sleep(500);
		System.out.println("java");
	}
	@Test
	void Selenium()
	{
		System.out.println("selenium");
	}
	

}
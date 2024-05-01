package Demo3456;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation12 {
	
		@Test(invocationCount=3)
		void loginopen()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
	}
}




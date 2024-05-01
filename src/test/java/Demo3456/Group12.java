package Demo3456;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Group12 {
	@Test
	void googleopen()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http:www.google.com");
	}
	@Test
	void amazonopen()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http:www.fb.com");
	}

}

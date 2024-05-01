package Demo3456;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Group123 {
	@Test
	void loginopen()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http:www.google.com");
	}
	@Test
	void Souceopen()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

}

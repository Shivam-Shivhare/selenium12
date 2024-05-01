package Demo3456;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Demo3456.AddListeners.class)
public class Testcase extends Baseclass {
	@Test
	void loginopen()
	{
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("usernam")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
	}

}

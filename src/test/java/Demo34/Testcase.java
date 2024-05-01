package Demo34;

import org.openqa.selenium.By;
import org.testng.ITestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Testcase extends Baseclass{
	

	
	@Test
	void loginOpne()
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("passwor")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
	}

	

}

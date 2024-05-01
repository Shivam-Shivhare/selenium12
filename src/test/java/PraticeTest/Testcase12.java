package PraticeTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase12 extends Baseclass1 {
	@Test
	void test2()
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("usernam")).sendKeys("student");
	}

}
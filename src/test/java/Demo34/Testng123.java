package Demo34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng123 {

	public WebDriver driver;
	@BeforeClass
	
	void m2()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
	@Test
	void m3()
	{
		driver.findElement(By.id("username")).sendKeys("student");
	}
	@Test
	void m4()
	{
		driver.findElement(By.id("password")).sendKeys("Password123");
	}
	@Test
	void m5()
	{
		driver.findElement(By.id("submit")).click();
	}
	@AfterClass
	void m6()
	{
		driver.close();
	}
}

	
	
		

	



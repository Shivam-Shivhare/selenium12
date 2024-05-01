package Demo34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng12 {
	
	public WebDriver driver;
	@Test
	
	void m1()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test
	void m2() 
	{
		driver.findElement(By.id("username")).sendKeys("student");
	}
	@Test
	void m3() 
	{
		driver.findElement(By.id("password")).sendKeys("Password123");
	}
	@Test
	void m4() 
	{
		driver.findElement(By.id("submit")).click();
	}
	
	
	

}

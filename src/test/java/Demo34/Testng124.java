package Demo34;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng124 {
	public WebDriver driver;
	@BeforeTest
	void m1()
	{
		System.out.println("m1");
	}
	@Test
	void m2()
	{
		System.out.println("m2");
	}
	@Test
	void m3()
	{
		System.out.println("m3");
	}
	@Test
	void m4()
	{
		System.out.println("m4");
	}
	@AfterTest
	void m5()
	{
		System.out.println("m5");
	}
		
	
}
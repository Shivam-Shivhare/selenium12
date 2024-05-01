package Demo34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom12 {
	WebDriver driver;
	public Pom12(WebDriver d)
	{
		driver =d;	
	}
	By Username=By.id("username");
	By Password=By.id("password");
	By Submit=By.id("submit");
	public void uname(String user)
	{
		driver.findElement(Username).sendKeys(user);
	}
	public void pass(String pas)
	{
		driver.findElement(Password).sendKeys(pas);
	}
	public void subbutton()
	{
		driver.findElement(Submit).click();
	}
}

	




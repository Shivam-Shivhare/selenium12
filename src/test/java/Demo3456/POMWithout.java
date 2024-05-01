package Demo3456;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMWithout {
	WebDriver driver;
	public  POMWithout(WebDriver d)
	{
		driver=d;
	}
	By Username=By.id("username");
	By Password=By.id("password");
	By Submit=By.id("submit");
		public void uname(String user)
		{
			driver.findElement(Username).sendKeys(user);
		}
		public void pass(String pass)
		{
			driver.findElement(Password).sendKeys(pass);
		}
		public void Subbutton()
		{
			driver.findElement(Submit).click();
		}
	
	

}

package Demo34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello13 {

	private static WebElement l2;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.xpath("//a[text()='Courses']")).click();
		driver.findElement(By.xpath("//a[text()='Enroll for just $5.99 on Teachable']")).click();
		driver.findElement(By.xpath("//button[@data-ss-event-type='button']")).click();
		//List<WebElement>l1=driver.findElements(By.tagName("a"));
	//	System.out.println(l1.size());
		//for(WebElement l2:l1);
	//	{
		//	System.out.println(l2.getText());
	//	}
	}

}

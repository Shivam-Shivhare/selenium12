package Demo34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame12 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		 driver.findElement(By.id("a")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement l1= driver.findElement(By.id("animals"));
		Select sc=new Select(l1);
		sc.selectByVisibleText("Baby Cat");
		
		

	}

}

package Demo34;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Radio {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.in/");
		//driver.findElement(By.xpath("/input[@type='radio'][5]")).click();
		Actions act=new Actions(driver);
		WebElement d1=driver.findElement(By.xpath("//ul[@id='menu-header-1']/li[5]/a"));
		act.moveToElement(d1).perform();

	}

}
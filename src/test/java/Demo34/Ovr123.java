package Demo34;

import java.awt.Desktop.Action;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ovr123 {

	private static final WebElement Source = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.in/");
		Actions act=new Actions(driver);
		WebElement l1=driver.findElement(By.linkText("eBay For Business"));
		act.moveToElement(l1).perform();
		
	}

}

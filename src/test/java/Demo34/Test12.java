package Demo34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test12 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
	//	driver.findElement(By.linkText("Auto Loan Calculator"));
		
		List<WebElement>l1=driver.findElements(By.tagName("a"));
		System.out.println(l1.size());
		for(WebElement l2:l1) {
			System.out.println(l2.getText());
		}
	}

}

package Demo34;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
	//	js.executeScript("window.location='https://practicetestautomation.com/practice-test-login/'");
		js.executeScript("window.location='https://www.calculator.net/'");
	//	js.executeScript("document.getElementById('username').value='student'");
	//	js.executeScript("document.getElementById('password').value='Password123'");
	//	WebElement e1=driver.findElement(By.id("submit"));
	//	js.executeScript("arguments[0].click();", e1);//Log out
		WebElement e2=driver.findElement(By.linkText("Scientific Calculator"));
		js.executeScript("arguments[0].scrollIntoView();",e2);
	//	js.executeScript("arguments[0].style.border='3px solid red';", e2);
	//	js.executeScript("history.go(0)");
		
		
	}

	
	

}

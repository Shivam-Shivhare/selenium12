package Demo34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp12 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
	//	driver.findElement(By.id("confirmexample")).click();
		driver.findElement(By.id("promptexample")).click();
		driver.switchTo().alert().sendKeys("welcome");
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); 
	}

}

package Demo34;

import java.time.Duration;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impicity12 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("usernam")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
	}
}



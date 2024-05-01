package Demo34;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.github.dockerjava.api.model.Driver;

public class Fluent123 {

	

	

	public static <driver> void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Wait<WebDriver> w=new FluentWait<WebDriver>(null, null, null)
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("student");
		

	}

}

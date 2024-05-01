package Demo34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demooo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	}
	

}


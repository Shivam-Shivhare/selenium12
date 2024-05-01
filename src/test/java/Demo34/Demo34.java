package Demo34;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo34 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("Pke_EE")).sendKeys("MOBILE");
		driver.findElement(By.className("_2iLD__")).click();
		WebElement e1=driver.findElement(By.className("_4rR01T"));
		e1.click();
		driver.findElement(By.className("_1fGeJ5 PP89tw")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}

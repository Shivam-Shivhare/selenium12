import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo99 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement d1=driver.findElement(By.id("username"));
        d1.sendKeys("student");
        WebElement d2=driver.findElement(By.id("password"));
        d2.sendKeys("Password123");
        WebElement d3=driver.findElement(By.id("submit"));
        d3.click();
	}

}

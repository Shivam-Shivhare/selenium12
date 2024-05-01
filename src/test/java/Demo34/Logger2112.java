package Demo34;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Logger2112 {

	public static void main(String[] args) {
		Logger l1=LogManager.getLogger("Logger2112");
		l1.warn("warning message");
		WebDriver driver=new ChromeDriver();
		l1.info("This is a url");
		driver.get("https://practicetestautomation.com/practice-test-login/");
		l1.info("username");
		driver.findElement(By.id("username")).sendKeys("student");
		l1.info("This is a password");
		driver.findElement(By.id("password")).sendKeys("Password123");
		l1.info("This is a submitbutton");
		driver.findElement(By.id("submit")).click();
		
		

	}

}

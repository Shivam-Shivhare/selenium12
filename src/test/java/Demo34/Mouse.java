package Demo34;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
		Actions act=new Actions(driver);
		//Thread.sleep(5000);
		WebElement l1=driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(l1).build().perform();
		

	}

}

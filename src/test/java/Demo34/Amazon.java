package Demo34;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement l1= driver.findElement(By.xpath("//img[@alt='Grocery']"));
		File f1=l1.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Users\\admin\\eclipse-workspace\\newPro\\Screenshot\\helloworld.png");
		FileUtils.copyFile(f1, f2);
		
	//	 driver.findElement(By.id("nav-search-submit-button")).click();
		// driver.findElement(By.linkText("Limited time deal")).click();
	}



}

package Demo34;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen1 {
	public static void main(String[] arg ) throws IOException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	WebElement e1=driver.findElement(By.xpath("//a[text()='Courses']"));
		File f1=e1.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Users\\admin\\eclipse-workspace\\newPro\\Screenshot\\newtell12.png");
		FileUtils.copyFile(f1, f2);
	}

}

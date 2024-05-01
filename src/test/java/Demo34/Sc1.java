package Demo34;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot tc=(TakesScreenshot) driver;
		File f1=tc.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Users\\admin\\eclipse-workspace\\newPro\\Screenshot\\hello.png");
		FileUtils.copyFile(f1, f2);
		
		
	}

}
   
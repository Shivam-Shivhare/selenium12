package Demo34;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	public static WebDriver driver=null;
	@BeforeSuite
	void browserLunch()
	{
		driver=new ChromeDriver();
	}
	public void  Screenshot()throws IOException
	{
		File f1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Users\\admin\\eclipse-workspace\\newPro\\Screenshot\\ko.png");
		FileUtils.copyFile(f1, f2);
	}

}

package Demo34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Choose {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		Thread.sleep(5000);
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\admin\\OneDrive\\Documents\\FILE.txt");
	
	}

}

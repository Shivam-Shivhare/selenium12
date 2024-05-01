package Demo34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cap {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cxracing.com/");
		
		driver.findElement(By.xpath("//div[@class='content-tagline content-tagline-c aos-init aos-animate']/a[@href='products-by-car/products-by-car-subaru/products-by-car-subaru-brz-frs']")).click();
	}

}

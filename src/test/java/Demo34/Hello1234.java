package Demo34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello1234 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://test.rubywatir.com/radios.php");
		WebElement l1= driver.findElement(By.xpath("//input[@type='radio'][5]"));
		if(l1.isSelected())
		{
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
		}

	}
}




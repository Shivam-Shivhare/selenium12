package Demo34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice12 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5500/my%20form.html");
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("shivam gupta");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("shivamshiv957@gmail.com");
		WebElement l1=driver.findElement(By.tagName("select"));
		Select sc=new Select(l1);
		sc.selectByVisibleText("us");
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		
		WebElement e1=driver.findElement(By.xpath("//input[@type='date']"));
		e1.sendKeys("20-05-1996");
		driver.findElement(By.xpath("//input[@value='Programmer'][1]")).click();
		driver.findElement(By.xpath("//input[@value='Programmer'][2]")).click();
		driver.findElement(By.name("massage")).sendKeys("my name is shivam gupta basicelly belong to agra but live in delhi");
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		

	}

}

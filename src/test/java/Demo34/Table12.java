package Demo34;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table12 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/hello.html");
		WebElement e1=driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
		System.out.println(e1.getText());

	}

}

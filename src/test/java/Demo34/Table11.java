package Demo34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/hello.html");
		List<WebElement> row=driver.findElements(By.xpath("//table/tbody/tr"));
		int r=row.size();
		System.out.println(r);
		List<WebElement> col=driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		int c=col.size();
		System.out.println(c);
		for(int i=2;i<=r;i++) {
			
		
		for(int j=1;j<=c;j++)
		{
			//String i = null;
			String s=driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
			System.out.println(s);
		}
		
		}

	}

}

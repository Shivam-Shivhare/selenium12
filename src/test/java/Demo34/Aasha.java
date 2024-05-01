package Demo34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aasha {

	public static void main(String[] args) {
		String ExpMonth="May";
		String ExpYear="2026";
		String ExpDay="20";
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		WebElement l1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(l1);
		driver.findElement(By.id("datepicker")).click();
		while(true)
		{
			String ActMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String ActYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(ActMonth.equals(ExpMonth)&&(ActYear.equals(ExpYear)))
			{
				List<WebElement> l2=driver.findElements(By.xpath("//table/tbody/tr/td"));
				for(WebElement l3:l2)
				{
				String ActDay=l3.getText();
					if(ActDay.equals(ExpDay))
					{
						l3.click();
						break;
						
					}
				}
			break;
			}
			else
			{
			 	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		
		
		
		

	}

}

package Demo34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pri {
		public static void main(String[] args) {
			String ExpMonth="May";
			String ExpYear="2024";
			String ExpDay="8";
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
					List<WebElement> m1=driver.findElements(By.xpath("//table/tbody/tr/td"));
					for(WebElement m2:m1)
					{
						String ActDay=m2.getText();
						if(ActDay.equals(ExpDay))
						{
							m2.click();
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
package Demo34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cal123 {

	public static void main(String[] args) {
		String Exp="8";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com/hotels/");
		driver.findElement(By.id("txtcimy")).click();
		WebElement l1=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sc=new Select(l1);
		sc.selectByVisibleText("May");
		WebElement l2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sc1=new Select(l2);
		sc1.selectByVisibleText("2025");
		List<WebElement>m1=driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement m2:m1)
		{
			String Act=m2.getText();
			if(Act.equals(Exp))
			{
				m2.click();
				break;
			}
		}
		String ExpDay="20";
		String ExpMonth="July";
		String ExpYear="2025";
		driver.findElement(By.id("txtcomy")).click();
		while(true)
		{
		String p1=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String p2=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(p1.equals(ExpMonth)&&(p2.equals(ExpYear)))
		{
			List<WebElement>p3=driver.findElements(By.xpath("//table/tbody/tr/td"));
			for(WebElement p4:p3)
			{
				String ActDay=p4.getText();
				if(ActDay.equals(ExpDay))
				{
					p4.click();
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

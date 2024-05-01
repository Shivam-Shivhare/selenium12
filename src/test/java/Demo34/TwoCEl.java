package Demo34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwoCEl {

	public static void main(String[] args) {
		String Exp="20";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com/hotels/");
		driver.findElement(By.id("txtcimy")).click();
		WebElement l1=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sc=new Select(l1);
		sc.selectByVisibleText("May");
		WebElement l2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sc1=new Select(l2);
		sc1.selectByVisibleText("2024");
		List<WebElement> e1=driver.findElements(By.xpath("//table/tbody/tr/td"));//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		for(WebElement e2:e1)
		{
			String s1=e2.getText();
			if(s1.equals(Exp))
			{
				e2.click();
				break;
			}
		} 
		String EXPM="July";
		String EXPY="2024";
		String EXPD="22";
	//	driver.findElement(By.id("txtcomy")).click();
		while(true)
		{	
		String h1=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String h2=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(h1.equals(EXPM)&&(h2.equals(EXPY)))
		{
			List<WebElement> o1=driver.findElements(By.xpath("//table/tbody/tr/td"));
			for(WebElement o2:o1)
			{
				String h3=o2.getText();
				if(h3.equals(EXPD))
				{
					o2.click();
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


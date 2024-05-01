package Demo34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra12 {

	public static void main(String[] args) throws InterruptedException {
		String ExpMonthYear="June' 24";
		String ExpDay="5";
		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.yatra.com/'");
		driver.navigate().refresh();
		driver.findElement(By.id("BE_flight_origin_date")).click();
		Thread.sleep(3000);
		List<WebElement>l1=driver.findElements(By.xpath("//div[@class='js-month-container']//div[@class='month-title']"));
		Thread.sleep(3000);
		for(WebElement l2:l1)
		{
			String Actmonthyear=l2.getText();
			if(Actmonthyear.equals(ExpMonthYear))
			{
				System.out.println(Actmonthyear);
				js.executeScript("arguments[0].scrollIntoView();",l2);
				List<WebElement>l3=driver.findElements(By.xpath("//div[@class='js-month-container']//div[@class='day-container']/table/tbody//tr//td[not(@class='inActiveTD weekend' or  @class='inActiveTD')]"));
				for(WebElement l4:l3)
				{
					String Actday=l4.getText();
					String s[]=Actday.split("\n");
					String date = s[0].trim();
					//System.out.println(date);
					if(date.equals(ExpDay))
					{
						System.out.println(Actday);
						l4.click();
						break;
					}
				}
				}
				
			}
		}
	}



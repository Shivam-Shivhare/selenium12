package Demo34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ixio12 {

	public static void main(String[] args) throws InterruptedException {
		String ExpMonth="July 2024";
		String ExpDay="20";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement l1=driver.findElement(By.xpath("//div[@class='bg-charcoal-40 hover:bg-neutral-subtle-over w-full']"));
		l1.click();
		while(true)
		{
			Thread.sleep(3000);
			String ActMonthYear=driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).getText();
			if(ActMonthYear.equals(ExpMonth))
			{
				List<WebElement> p1=driver.findElements(By.xpath("//div[@class='react-calendar__month-view__days']/button/abbr"));
				for(WebElement p2:p1)
				{
					String ActDay=p2.getText();
					if(ActDay.equals(ExpDay))
						
					{					
						System.out.println(ActDay);
						p2.click();
						break;
					}
				}
				break;
			}
			else {
				driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
			}
			}
		

	}

} 

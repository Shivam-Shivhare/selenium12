package Demo34;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ixigo22 {
	public static void main(String[] args) throws InterruptedException {
		String ExpYear="2024";
		String ExpMonth="May";
		String ExpDay="20";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='bg-charcoal-40 hover:bg-neutral-subtle-over w-full']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		while(true)
		{
			Thread.sleep(3000);////span[text()='March 2024']
			String ActYear=driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']/span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).getText();
			if(ActYear.equals(ExpYear))
				{
				List<WebElement> l1=driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']/abbr"));   
				for(WebElement l2:l1)
						{
					         String actMonth=l2.getText();
					         if(actMonth.equals(ExpMonth))
					         {
					        	 l2.click();
					        	 List<WebElement> l3=driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day']/abbr"));
					        	 for(WebElement l4:l3) 
					        	 {
					        		 String Actday=l4.getText();
					        		 if(Actday.equals(ExpDay))
					        		 { 
					        			 Thread.sleep(3000);
					        			 l4.click();
					        			 break;
					        		 }
					        	 }
					         }
						}
				break;
			}
			else
			{
				driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
			}
		}

	}

}

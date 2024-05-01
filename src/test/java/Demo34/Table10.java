package Demo34;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table10 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/hello.html");
		WebElement e1=driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
		System.out.println(e1.getText());
		List<WebElement> col=driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("total col="+col.size());
	}
	

	}



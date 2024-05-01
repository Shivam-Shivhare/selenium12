package Demo34;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascri {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.calculator.net/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.calculator.net/'");
	//	js.executeScript("window.scrollTo(0,250)");
	//	js.executeScript("window.scrollBy(0,250)");
	//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	//	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	//	js.executeScript("document.body.style.zoom='150%'");
	//	String height=js.executeScript("return window.innerHeight;").toString();
	//	System.out.println(height);
	//	String width=js.executeScript("return window.innerWidth;").toString();
	//	System.out.println(width);
		js.executeScript("alert('Alert-Messsage');");
		

	}

}

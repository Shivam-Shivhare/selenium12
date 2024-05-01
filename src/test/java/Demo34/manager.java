package Demo34;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class manager {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor) driver;
//	driver.get("https://www.ixigo.com/");
	js.executeScript("window.location='https://practicetestautomation.com/practice-test-login/'");
	String s1=js.executeScript("return document.URL").toString();
	System.out.println(s1);
	String s2=js.executeScript("return document.title").toString();
	System.out.println(s2);
	String s3=js.executeScript("return document.domain").toString();
	System.out.println(s3);
	js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	//js.executeScript("window.scrollBy(0,500)");
	//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//js.executeScript("document.body.style.zoom='50%'");
     String Height=js.executeScript("return window.innerHeight;").toString();
     System.out.println(Height);
     String width=js.executeScript("return window.innerWidth;").toString();
     System.out.println(width);
    // js.executeScript("alert('Alert-Messsage');");
     js.executeScript("document.getElementById('username').value='student'");
     js.executeScript("document.getElementById('password').value='Password123'");
    WebElement l1= driver.findElement(By.id("submit"));
    js.executeScript("arguments[0].click();",l1);
    WebElement l2=driver.findElement(By.linkText("Log out"));
    js.executeScript("arguments[0].style.border='3px solid red';", l2);  
    // js.executeScript("history.go(0)");



	}

}

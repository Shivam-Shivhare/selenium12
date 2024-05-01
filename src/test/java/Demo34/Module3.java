package Demo34;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String s1=js.executeScript("return document.domain;").toString();
		System.out.println(s1);
		String s2=js.executeScript("return document.URL;").toString();
		System.out.println(s2);
		String s3=js.executeScript("return document.title;").toString();
		System.out.println(s3);
		
		

	}

}

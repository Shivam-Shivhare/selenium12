package Demo3456;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		POMWithout po=new POMWithout(driver);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		po.uname("student");
		po.pass("Password123");
		po.Subbutton();
		

	}

}
package Demo34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pom12testfile {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Pom12 pm=new Pom12(driver);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		pm.uname("student");
		pm.pass("Password123");
		pm.subbutton();

	}

}

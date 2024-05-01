package Demo34;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logger21 {

	public static void main(String[] args) {
		Logger l1=LogManager.getLogger("Logger21");
		l1.info("brwser");
		WebDriver driver=new ChromeDriver();
		l1.info("url");
		driver.get("https://www.google.com");
	}

}

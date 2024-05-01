import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import freemarker.log.Logger;

public class Logger12 {

	public static void main(String[] args) {
		Logger l=(Logger) LogManager.getLogger("Logger12");
		l.info("url");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		

	}

}

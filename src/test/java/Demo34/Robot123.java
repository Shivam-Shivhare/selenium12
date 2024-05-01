package Demo34;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot123 {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		WebElement e1=driver.findElement(By.id("uploadFile"));
		Actions act=new Actions(driver);
		act.click(e1).perform();
		Robot rd=new Robot();
		rd.delay(2000);
		StringSelection Copy =new StringSelection("C:\\Users\\admin\\Downloads\\wworld.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Copy, null);
		rd.keyPress(KeyEvent.VK_CONTROL);
		rd.keyPress(KeyEvent.VK_V);
		rd.keyPress(KeyEvent.VK_ENTER);
		rd.keyRelease(KeyEvent.VK_CONTROL);
		rd.keyPress(KeyEvent.VK_V);
		rd.keyPress(KeyEvent.VK_ENTER);
		
		
		

	}

}

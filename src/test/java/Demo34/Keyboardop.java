package Demo34;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardop {

	private static final CharSequence ENTER = null;
	private static final CharSequence Keys = null;
	private static final CharSequence CONTRAL = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions act=new Actions(driver);
		driver.findElement(By.id("APjFqb")).sendKeys("mobil");
		act.keyDown(org.openqa.selenium.Keys.CONTROL);
		act.sendKeys("A");
		act.keyUp(org.openqa.selenium.Keys.CONTROL).perform();
		//act.sendKeys(Source,"mobile").perform();
		act.sendKeys(org.openqa.selenium.Keys.ENTER).perform();
		

	}

}

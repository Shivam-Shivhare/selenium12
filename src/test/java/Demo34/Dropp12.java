package Demo34;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropp12 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.id("box1"));
		WebElement dest=driver.findElement(By.id("box101"));
		act.dragAndDrop(source, dest).perform();
		

	}

}

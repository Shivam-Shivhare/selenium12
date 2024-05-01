package Demo34;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class DEMOO {

	private static final String List = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement l1=driver.findElement(By.tagName("select"));
		Select sc=new Select(l1);
		if(sc.isMultiple()) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

}

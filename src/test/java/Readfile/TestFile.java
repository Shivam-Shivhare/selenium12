
package Readfile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFile {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		Readfile rn=new Readfile();
driver.get(rn.getUrl());
		
		driver.findElement(By.id("username")).sendKeys(rn.getUsername());
		driver.findElement(By.id("password")).sendKeys(rn.getPassword());

		
				
		driver.findElement(By.id("submit")).click();
		
		

	}

}

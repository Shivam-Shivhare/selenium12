package com.soft3.com23.newPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pracal {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://addmug.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for products'][1]")).sendKeys("castophene");
		driver.findElement(By.xpath("//button[@class='searchsubmit'][1]")).click();
	//	driver.findElement(By.id("quantity_65e21e6851c58")).click();

	}

}

package com.soft3.com23.newPro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyper12 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		List<WebElement>l1=driver.findElements(By.tagName("a"));
		for(WebElement l2:l1) {
			System.out.println(l2.getText());
		}
	}

}

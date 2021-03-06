//package com.dezlearn.qa.webelements_collection;
//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class WebElements_Collection {
//
//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.actitime.com/");
//		
//		List<WebElement> links = driver.findElements(By.cssSelector("a"));
//		
//		for(WebElement link : links) {
//			String text=link.getText();
//			if(!text.trim().isEmpty()) {
//				System.out.println(text);
//				System.out.println("-------------");
//			}
//		}
//		
//		driver.close();
//
//	}
//
//}

package com.dezlearn.qa.webelements_collection;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Collection {

	public static void main(String[] args) {

		/*
		 * Example: Get collection of all the links from a web page
		 */

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.actitime.com/");

		List<WebElement> links = driver.findElements(By.cssSelector("a.main-menu__link"));

		for (WebElement link : links) {
			String text = link.getText();
			if (!text.trim().isEmpty()) {
				System.out.println(link.getText());
				System.out.println(link.getAttribute("class"));
				System.out.println("-------------------");
			}
		}

		driver.close();

	}

}

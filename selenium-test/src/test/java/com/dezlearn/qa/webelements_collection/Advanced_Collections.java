package com.dezlearn.qa.webelements_collection;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanced_Collections {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.goodreads.com/");

		List<WebElement> books = driver.findElements(By.cssSelector("img[src$='jpg']"));

		System.out.println(books.size());

		for (WebElement book : books) {
			System.out.println(book.isDisplayed());
			System.out.println(book.getAttribute("alt"));
			System.out.println("------------------");
		}

		driver.close();
	}

}

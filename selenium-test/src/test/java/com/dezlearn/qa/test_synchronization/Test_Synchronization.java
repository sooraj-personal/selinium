package com.dezlearn.qa.test_synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Synchronization {
    public static void main(String[] args) throws Exception{

        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.dezlearn.com/test-sync-example/");

        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Sooraj");
        driver.findElement(By.xpath("//div[@id='content']//input[2]")).sendKeys("S");
        driver.findElement(By.xpath("//input[3]")).sendKeys("test@gmail.com");
        
        driver.findElement(By.xpath("//button[@id='u_5_6']")).click();
        driver.findElement(By.linkText("Go to Next Page")).click();

    }
    
}

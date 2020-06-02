package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello {

    @Test
    public void searchSelenium()
    {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //指定要调用的WebDriver,也可以用Chrome
        //语法相应变为：System.setProperty("webdriver.chrome.driver", "drivers/chromedriver")

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.baidu.com/");
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.id("kw")).sendKeys("selenium");
        driver.findElement(By.id("su")).click();
        driver.quit();
    }
}
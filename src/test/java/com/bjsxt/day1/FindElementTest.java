package com.bjsxt.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindElementTest {

    WebDriver chromeDriver;
    @BeforeMethod
    public void openBrowers(){
        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.baidu.com/");
    }

    /**
     * 通过id定位搜索文本框
     */
    @Test
    public  void byIdTest(){
        chromeDriver.findElement(By.id("kw"));
    }

    /**
     * 通过name定位搜索文本框
     */
    @Test
    public  void byNameTest(){
        chromeDriver.findElement(By.name("wd"));
    }

    /**
     * 通过classname定位搜索文本框
     */
    @Test
    public  void byClassNameTest(){
        chromeDriver.findElement(By.className("soutu-btn"));
    }

    @AfterMethod
    public void closeBrowser(){
        chromeDriver.quit();
    }
}

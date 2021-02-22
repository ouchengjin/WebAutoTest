package com.bjsxt.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseBrowser {

    @Test
    public void closeChromeBrowser() throws InterruptedException {
        //设置chrome.driver
        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        Thread.sleep(3000);
        //chromeDriver.close();
        chromeDriver.quit();
    }
}

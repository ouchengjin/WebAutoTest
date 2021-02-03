package com.bjsxt.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenBrowser {

    @Test
    public void openFirefoxBrowser(){
        System.setProperty("webdriver.firefox.bin","E:\\Mozilla Firefox\\firefox.exe");
        WebDriver firefoxDriver = new FirefoxDriver();
    }
    @Test
    public void openChromeBrowser(){
//        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aaron\\.ssh\\workspace\\muke\\WebAutoTest\\drivers\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();

    }

}

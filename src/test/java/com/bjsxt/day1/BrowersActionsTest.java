package com.bjsxt.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowersActionsTest {
    WebDriver webDriver;

    @BeforeMethod
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    /**
     * 打开百度
     * 5秒后关闭
     */
    @Test
    public void getTest() throws InterruptedException {

//        System.setProperty("webdriver.firefox.bin","E:\\Mozilla Firefox\\firefox.exe");
//        webDriver = new FirefoxDriver();
        webDriver.get("http://www.baidu.com/");
        Thread.sleep(5000);
    }

    @Test
    public void backTest() throws InterruptedException {

        webDriver.get("http://www.baidu.com/");
        Thread.sleep(3000);
        webDriver.navigate().back();
        Thread.sleep(3000);


    }
    @Test
    public void forwardTest() throws InterruptedException {

        webDriver.get("http://www.baidu.com/");
        Thread.sleep(3000);
        webDriver.navigate().back();
        Thread.sleep(3000);
        webDriver.navigate().forward();
        Thread.sleep(2000);
        Thread.sleep(2000);


    }
    @Test
    public void refreshTest() throws InterruptedException {

        webDriver.get("https://www.runoob.com/");
        Thread.sleep(3000);
        webDriver.navigate().refresh();
        Thread.sleep(2000);



    }

    /**
     * 打开chrome
     * 设置窗口大小500*500
     * 等待3秒
     * 窗口最大化
     * 等待3秒
     * 关闭窗口
     * @throws InterruptedException
     */
    @Test
    public void winTest() throws InterruptedException {

        Dimension dimension= new Dimension(500,500);
        Thread.sleep(3000);
        webDriver.manage().window().setSize(dimension);
        Thread.sleep(3000);
        webDriver.manage().window().maximize();
        Thread.sleep(3000);


    }

    /**
     * 打开chrome
     * 打开百度首页
     * 获取当前页面URL
     * 等待3秒
     * 校验当前页面url是否是百度网址
     * 关闭窗口
     * @throws InterruptedException
     */
    @Test
    public void getUrlTest() throws InterruptedException {

        webDriver.get("https://www.baidu.com/");
        String currentUrl = webDriver.getCurrentUrl();
        System.out.println(currentUrl);
        Thread.sleep(3000);
        Assert.assertEquals(currentUrl,"https://www.baidu.com/");

    }
    @AfterMethod
    public void quit(){
        webDriver.quit();
    }
}

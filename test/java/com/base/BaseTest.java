package com.base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public WebDriver driver;

    @BeforeSuite
    public void login() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
    }

//@AfterSuite
//public void logout()
//{
//    driver.quit();
//}
}
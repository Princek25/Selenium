package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void launchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jar and drivers//Chrome Driver//chromedriver.exe");
        driver.manage().window().maximize();
    }

    @Test
    public void frameConcept() throws InterruptedException {
        driver.get("file:///C:/Users/Prince%20K/Desktop/Java%20Projects/HTML%20Files/LastName.html");
        driver.switchTo().frame(0);
        driver.findElement(By.id("t1")).sendKeys("Prince");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("Kumar");
    }

    @AfterMethod
    public void closeChromeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssSelector {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void launchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jar and drivers//Chrome Driver//chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void cssSelector(){

        // cssSelector() - type - email
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Prince");
        driver.findElement(By.cssSelector("input[type='text']")).clear();

        // cssSelector() - id - password
        driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("prince123");
        driver.findElement(By.cssSelector("input[id='pass']")).clear();

        // cssSelector() - class - email
        driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']")).sendKeys("Prince");
        driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']")).clear();

        // cssSelector() - value - login
        driver.findElement(By.cssSelector("button[value='1']")).click();

        // cssSelector() - multiple attributes - email
        driver.findElement(By.cssSelector("input[type='text'][id='email']")).sendKeys("Princek25");
        driver.findElement(By.cssSelector("input[type='text'][id='email']")).clear();

        // cssSelector() - id - # - email
        driver.findElement(By.cssSelector("#email")).sendKeys("Prince6");
    }

    @AfterMethod
    public void closingTheChromeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

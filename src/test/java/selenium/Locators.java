package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Locators {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void launchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jar and drivers//Chrome Driver//chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void locators() throws InterruptedException {

        WebElement linkText = driver.findElement(By.linkText("Create new account"));
        linkText.click();
        Thread.sleep(2000);

        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("prince");
        Thread.sleep(2000);

        WebElement id = driver.findElement(By.id("u_3_g_xK"));
        id.sendKeys("9154");
       // driver.findElement(By.id("u_3_d_aS")).sendKeys("kumar");
    }


    @AfterMethod
    public void closeChromeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}

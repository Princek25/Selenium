package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XPath {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void launchingChromeAndSignupFacebook() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jar and drivers//Chrome Driver//chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void usingXpath(){

        // Absolute xpath - full xpath - email
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("abc");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).clear();

        // relative xpath ---------------->

        // Attributes - //tagname[@attributeName = 'attributeValue'] - password
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("fhgfg");
        driver.findElement(By.xpath("//*[@id='pass']")).clear();

        // contain() - email
        driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("123");

        // starts-with() - password
        driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("pre32");
    }

    @AfterMethod
    public void closingTheChromeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

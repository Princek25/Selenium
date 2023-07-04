package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElementMethods {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void launchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jar and drivers//Chrome Driver//chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void webElementMethods() throws InterruptedException {

        // sendKey()
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");

        // clear()
        Thread.sleep(2000);
        driver.findElement(By.name("email")).clear();

        // click()
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();

        // getAttributes()
        String ClassAttribute = driver.findElement(By.name("email")).getAttribute("class");
        System.out.println("Attributes of class - " + ClassAttribute);

        // getCssValue()
        String CssValueOfLogin = driver.findElement(By.name("login")).getCssValue("background-color");
        System.out.println("Css value of login - " + CssValueOfLogin);

        // getSize()
        System.out.println("Size - " + driver.findElement(By.name("login")).getSize());
        System.out.println("Height - " + driver.findElement(By.name("login")).getSize().getHeight());
        System.out.println("Width - " + driver.findElement(By.name("login")).getSize().getWidth());

        // getLocation()
        System.out.println("Location - " + driver.findElement(By.name("login")).getLocation());
        System.out.println("X-Axis - " + driver.findElement(By.name("login")).getLocation().getX());
        System.out.println("Y-Axis - " + driver.findElement(By.name("login")).getLocation().getY());

        // getText()
        System.out.println("Get Text - " + driver.findElement(By.name("login")).getText());

        // getTagName()
        System.out.println("Get Tagname - " + driver.findElement(By.name("login")).getTagName());

        // isDisplay
        System.out.println("isDisplay - " + driver.findElement(By.name("login")).isDisplayed());

        // isEnable
        System.out.println("isEnable - " + driver.findElement(By.name("login")).isEnabled());

        // isSelected
        System.out.println("isSelected - " + driver.findElement(By.name("login")).isSelected());
    }

    @AfterMethod
    public void closingTheChromeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}

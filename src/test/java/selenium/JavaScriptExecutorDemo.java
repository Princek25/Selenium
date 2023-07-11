package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class JavaScriptExecutorDemo {

    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void launchingFacebookInChrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jar and drivers//Chrome Driver//chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
    }

    @Test
    public void scrollUpAndDown() throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        javascriptExecutor.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(2000);
    }

    @Test
    public void enterText_intoDisabledTextbox() throws InterruptedException {
        driver.get("file:///C:/Users/Prince%20K/Desktop/Java%20Projects/HTML%20Files/javascript.html");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        javascriptExecutor.executeScript("document.getElementById('t1').value='Prince K'");
        Thread.sleep(2000);
        javascriptExecutor.executeScript("document.getElementById('t2').value=''");
        Thread.sleep(2000);
        javascriptExecutor.executeScript("document.getElementById('t2').value='Bridgelabz'");
        Thread.sleep(2000);
        javascriptExecutor.executeScript("document.getElementById('t2').type='button'");
    }

    @AfterClass
    public void closingTheChromeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

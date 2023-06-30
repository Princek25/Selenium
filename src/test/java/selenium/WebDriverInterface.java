package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class WebDriverInterface {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void launchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jar and drivers//Chrome Driver//chromedriver.exe");
    }

    @Test
    public void usingWebDriverMethods() throws InterruptedException {

        // get()
        driver.get("https://www.google.com/");

        // manage()
        driver.manage().window().maximize();

        // getTitle()
        String title = driver.getTitle();
        System.out.println("The title of the webpage is - " + title);

        // getPageSource()
        String source = driver.getPageSource();
        System.out.println("The source code is - " + source);

        // getCurrentUrl()
        String url = driver.getCurrentUrl();
        System.out.println("The current URL is - " + url);

        // navigate()
        Thread.sleep(2000);
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();

        // getWindowHandle() -> return the ID of the single browser window
        String windowId = driver.getWindowHandle();
        System.out.println("ID of the single browser window - " + windowId);

        // quit()
        Thread.sleep(3000);
        driver.quit();
    }
}

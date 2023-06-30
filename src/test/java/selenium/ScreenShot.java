package selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void launchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jar and drivers//Chrome Driver//chromedriver.exe");
        driver.manage().window().maximize();
    }

    @Test
    public void takeScreenShot() throws IOException {
        driver.get("https://www.google.co.in/");
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File file = screenshot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File("C:\\Users\\Prince K\\Desktop\\Java Projects\\SeleniumAssignment2\\src\\test\\java\\selenium\\screenshot\\google1.png"));
    }

    @AfterMethod
    public void closeChromeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}

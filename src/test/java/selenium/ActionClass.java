package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionClass {

    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void launchingChrome()  {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jar and drivers//Chrome Driver//chromedriver.exe");
        driver.manage().window().maximize();
    }

    @Test
    public void contextClick() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        actions.contextClick(email).perform();
        Thread.sleep(2000);
    }

    @Test
    public void doubleClick() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        actions.doubleClick(password).perform();
        Thread.sleep(2000);
    }

    @Test
    public void moveToElement() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement hover = driver.findElement(By.xpath("//a[@class='_8esh']"));
        actions.moveToElement(hover).perform();
        Thread.sleep(2000);
    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.navigate().to("https://jqueryui.com/droppable/");
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        actions.moveToElement(drag).clickAndHold().perform();
        actions.release(drop).perform();
    }

    @Test
    public void keyboardMethods() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement forgotPass = driver.findElement(By.partialLinkText("Forgotten password?"));
        actions.contextClick(forgotPass).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Test
    public void googleShortcut() throws InterruptedException {
        driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=no6FWrDZA4nm8wf1u4TgBw");
        Actions actions = new Actions(driver);
        actions.sendKeys("selenium").perform();
        Thread.sleep(2000);
        actions.keyDown(Keys.CONTROL).sendKeys("A").perform();
        actions.keyUp(Keys.CONTROL).perform();
        Thread.sleep(2000);
        actions.keyDown(Keys.CONTROL).sendKeys("C").perform();
        actions.keyUp(Keys.CONTROL).perform();
        Thread.sleep(2000);
        actions.keyDown(Keys.CONTROL).sendKeys("T").perform();
        actions.keyUp(Keys.CONTROL).perform();
        Thread.sleep(2000);
        actions.keyDown(Keys.CONTROL).sendKeys("V").perform();
        actions.keyUp(Keys.CONTROL).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).perform();
    }

    @AfterClass
    public void closingTheChromeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void launchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Selenium jar and drivers//Chrome Driver//chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void signUpFacebook() throws InterruptedException {

        // click on create account
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(5000);

        // firstname
        driver.findElement(By.name("firstname")).sendKeys("Princek");

        // surname
        driver.findElement(By.name("lastname")).sendKeys("abc");

        // Mobile number or email address
        driver.findElement(By.name("reg_email__")).sendKeys("princek25@gmail.com");

        // re-enter email
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("princek25@gmail.com");

        // new password
        driver.findElement(By.name("reg_passwd__")).sendKeys("pr91ace@#");

        // date of birth
        driver.findElement(By.name("birthday_day")).sendKeys("25");
        driver.findElement(By.name("birthday_month")).sendKeys("Sep");
        driver.findElement(By.name("birthday_year")).sendKeys("1996");

        // gender - full xpath
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();

        // click on the signup
        driver.findElement(By.name("websubmit")).click();
    }

    //@Test
    public void loginFacebook() {

        //email
        driver.findElement(By.name("email")).sendKeys("princek2530@gmail.com");

        // password
        driver.findElement(By.name("pass")).sendKeys("pr9155!face@#");

        // click on login
        driver.findElement(By.name("login")).click();
    }

    @AfterMethod
    public void closeChromeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}

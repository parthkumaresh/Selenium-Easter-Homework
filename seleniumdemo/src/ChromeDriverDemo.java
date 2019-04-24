import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverDemo {

    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //allows up to 10 seconds to find locators

        //Find element of login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Enter email
        WebElement emailTextBox = driver.findElement(By.id("Email"));
        emailTextBox.sendKeys("archita.patel@gmail.com");

        //Enter password
        WebElement passwordTextBox = driver.findElement(By.id("Password"));
        passwordTextBox.sendKeys("iuhiuhiuhiuh");

        // driver.findElement(By.id("Password")).sendKeys("xyz123");
        WebElement rememberMe = driver.findElement(By.id("RememberMe"));
        rememberMe.click();

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));

        loginButton.click();
        // driver.findElement(By.xpath("//input[@value='Log in']")).click();

        Thread.sleep(5000);
        driver.close();
    }
}

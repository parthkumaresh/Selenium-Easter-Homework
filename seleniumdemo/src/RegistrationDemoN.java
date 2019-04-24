import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationDemoN {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement registerLink = driver.findElement(By.className("ico-register"));
        registerLink.click();

        WebElement register = driver.findElement(By.className("ico-register"));
        register.click();

        WebElement femaleGender = driver.findElement(By.id("gender-female"));
        femaleGender.click();

        WebElement firstName = ((ChromeDriver) driver).findElementById("FirstName");
        firstName.sendKeys("Firstname");

        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Lastname");

        WebElement dateDay = driver.findElement(By.name("DateOfBirthDay"));
        dateDay.sendKeys("18");

        WebElement dateMonth = driver.findElement(By.name("DateOfBirthMonth"));
        dateMonth.sendKeys("February");
        Thread.sleep(1000);

        WebElement dateYear = driver.findElement(By.name("DateOfBirthYear"));
        dateYear.sendKeys("1983");

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("xyz@xyz.com");

        WebElement newsLetter = driver.findElement(By.id("Newsletter"));
        newsLetter.click();

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("abcdefg");

        WebElement passwordConfirm = driver.findElement(By.id("ConfirmPassword"));
        passwordConfirm.sendKeys("abcdefg");
        Thread.sleep(1000);

        WebElement registerBtn = driver.findElement(By.id("register-button"));
        registerBtn.click();

        Thread.sleep(5000);
        driver.close();


    }
}

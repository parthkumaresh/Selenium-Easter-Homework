import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Rhubarb {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.gecko.driver", "src\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.rhubarb.co.uk/");

        WebElement location = driver.findElement(By.xpath("//li[@class='item-117']//a[contains(text(),'Locations')]"));
        location.click();
        Thread.sleep(5000);

        WebElement vivi = driver.findElement(By.xpath("//div[@class='main destinations']//div[4]//div[1]//a[1]"));
        vivi.click();
        Thread.sleep(5000);

        WebElement booknow = driver.findElement(By.xpath("//a[@class='btn btn-sm btn-info']"));
        booknow.click();
        Thread.sleep(5000);

        WebElement bookatable = driver.findElement(By.xpath("//a[contains(@class,'btn btn-lg animated')]"));
        bookatable.click();
        Thread.sleep(5000);

        driver.close();
    }
}

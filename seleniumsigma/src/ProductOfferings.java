import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ProductOfferings {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sigmaplc.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement aboutUs = driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'About Us')]"));
        aboutUs.click();
        Thread.sleep(5000);

        WebElement ourProductOfferings = driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Our Product Offerings')]"));
        ourProductOfferings.click();
        Thread.sleep(5000);

        WebElement ourServices = driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Our Services')]"));
        ourServices.click();
        Thread.sleep(5000);

        WebElement workingTogether = driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Working Together')]"));
        workingTogether.click();
        Thread.sleep(5000);

        WebElement contact = driver.findElement(By.xpath("//li[@id='menu-item-971']//a[contains(text(),'Contact')]"));
        contact.click();
        Thread.sleep(5000);

        WebElement newsAndEvents = driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'News and Events')]"));
        newsAndEvents.click();
        Thread.sleep(5000);

        driver.close();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class India_Portal {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Archita\\IdeaProjects\\india\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        driver.get("https://www.india.gov.in/");
        WebElement topics = driver.findElement(By.xpath("//*[@id='nav']/li[1]/a/img"));

        Actions action = new Actions(driver);
        action.moveToElement(topics).build().perform();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Defence")).click();
        Thread.sleep(2000);

        WebElement myGov = driver.findElement(By.xpath("//a[@class='myGovt']//img"));

        action.moveToElement(myGov).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Indian Parliament")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Who's Who")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Prime Minister")).click();
        Thread.sleep(5000);

        driver.close();
    }
}

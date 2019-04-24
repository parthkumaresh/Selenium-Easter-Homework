import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CoolEarth {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

        driver.get("https://www.coolearth.org/");
        WebElement whatWeDo = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
        Actions actions = new Actions(driver);

        actions.moveToElement(whatWeDo);
        actions.build().perform();
        driver.findElement(By.linkText("Our Mission")).click();
        Thread.sleep(3000);

        whatWeDo = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));

        actions.moveToElement(whatWeDo);
        actions.build().perform();
        driver.findElement(By.linkText("Our Approach")).click();
        Thread.sleep(3000);

        whatWeDo = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));

        actions.moveToElement(whatWeDo);
        actions.build().perform();
        driver.findElement(By.partialLinkText("Impact")).click();
        Thread.sleep(3000);

        whatWeDo = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));

        actions.moveToElement(whatWeDo);
        actions.build().perform();
        driver.findElement(By.partialLinkText("Rainforest?")).click();
        Thread.sleep(5000);

        driver.close();
    }
}

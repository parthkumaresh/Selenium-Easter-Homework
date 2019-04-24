import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomeEducation {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.manage().deleteAllCookies();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        chromeDriver.get("https://www.home-education.org.uk/");
        chromeDriver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/map[1]/area[4]")).click();
        Thread.sleep(3000);
        chromeDriver.findElement(By.linkText("Parents and Carers")).click();
        Thread.sleep(3000);
        // new window opens when below line is executed
        chromeDriver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[6]/td[1]/blockquote[7]/p[3]/a[1]")).click();
        Thread.sleep(5000);

        //both windows are stored in string Arraylist
        Set<String> allWindows = chromeDriver.getWindowHandles();
        System.out.println(allWindows.size());

        //driver switches to each windows through advance for loop and closes them.
        for(String win:allWindows){
            chromeDriver.switchTo().window(win).close();
            Thread.sleep(5000);
        }

        //launching website on Firefox and closing it
        System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
        WebDriver ffDriver = new FirefoxDriver();
        ffDriver.manage().deleteAllCookies();
        ffDriver.manage().window().maximize();
        ffDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        ffDriver.get("https://www.home-education.org.uk/");
        Thread.sleep(5000);
        ffDriver.close();
    }
}

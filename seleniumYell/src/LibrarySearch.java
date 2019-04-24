import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LibrarySearch {
    public static void main(String[] args) throws InterruptedException, Exception {

        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        driver.get("https://www.yell.com/");

        WebElement searchKeyword = driver.findElement(By.id("search_keyword"));
        searchKeyword.sendKeys("Library");

        WebElement searchLocation = driver.findElement(By.id("search_location"));
        searchLocation.sendKeys("northolt");

        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/descendant::li[@role='option']"));

        System.out.println("Total number of suggestions in search box : " + list.size());

        for (int i = 0; i < list.size(); i++) {
           // System.out.println(list.get(i).getText());

            if(list.get(i).getText().contains("northolt"))
            {
                list.get(i).click();
                break;
            }
        }
        WebElement searchBtn = driver.findElement(By.xpath("//button[@class='searchBar--submit btn btn-big btn-yellow btn-fullWidth']"));
        searchBtn.click();

        Thread.sleep(5000);
        driver.close();
    }
}

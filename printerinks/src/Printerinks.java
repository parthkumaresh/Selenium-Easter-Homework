import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Printerinks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Archita\\IdeaProjects\\printerinks\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        driver.get("https://www.printerinks.com/home2.html");

        WebElement sAndL = driver.findElement(By.cssSelector("div.msitehide:nth-child(1) div:nth-child(1) div:nth-child(2) a:nth-child(1) > span:nth-child(2)"));
        sAndL.click();

        String parent = driver.getWindowHandle();
     //   System.out.println("Parent Window is "+parent);

        WebElement requestQuote = driver.findElement(By.xpath("//span[contains(text(),'REQUEST A QUOTE >')]"));
        requestQuote.click();

        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();

      //  System.out.println("Total Windows are "+count);

        for(String child:allWindows) {
            if (!parent.equalsIgnoreCase(child)) {
                driver.switchTo().window(child);
                driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlTitle")).sendKeys("Prof");
                driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirstName")).sendKeys("Sofia");
                driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLastName")).sendKeys("Popat");
                driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtZipCode")).sendKeys("TR7 2AG");
                driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnFindAddressB")).click();
                driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[4]/div[4]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[2]/select[1]/option[8]")).click();

                Thread.sleep(3000);
                driver.switchTo().window(parent).close();
                driver.switchTo().window(child);
                WebElement company = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompanyName"));
                company.sendKeys("Company Name");
                Thread.sleep(3000);

                company.clear();
                driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCompanyName")).sendKeys("Browser is about to close!!");
                Thread.sleep(3000);
                driver.close();
            }
        }
    }
}


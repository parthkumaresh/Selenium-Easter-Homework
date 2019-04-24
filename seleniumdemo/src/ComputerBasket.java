import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ComputerBasket{
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement computerLink = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));
        computerLink.click();
        Thread.sleep(3000);

        WebElement desktopImage = driver.findElement(By.xpath("//img[@title='Show products in category Desktops']"));
        desktopImage.click();
        Thread.sleep(5000);

        WebElement addToBasket = driver.findElement(By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]"));
        addToBasket.click();
        Thread.sleep(5000);

        WebElement radioHDD = driver.findElement(By.id("product_attribute_3_6"));
        radioHDD.click();

        WebElement addToCart = driver.findElement(By.id("add-to-cart-button-1"));
        addToCart.click();
        Thread.sleep(5000);

        WebElement shoppingcart = driver.findElement(By.className("cart-label"));
        shoppingcart.click();
        Thread.sleep(5000);

        driver.close();
    }
}

package techproed.day05_XpathCssSelector_DayTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        /*
        Bir web elementi direk locate edemediğimiz durumlarda o webelementi
        etrafındaki webelementlerin referansı ile tarif etmemizi sağlar.
        Bir web sayfasında benzer özelliklere sahip web elementlerin olduğu durumlarda kullanılabilir.
        -abow==>belirtilen elementin üstünde olan elementi seçer
        -below==> belirtilen elementin altında olan elementi seçer
        -to_left_of ==> Belirtilen elementin solunda olan elementi seçer.
        -to_right_of ==> Belirtilen elementin sağında olan elementi seçer.
        -near ==> Belirtilen elementin yanında yada yakınında olan elementi seçer.
         */

        //amazon sayfasına gidelim
        driver.get("https://wwww.amazon.com");
        //city bike aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike"+ Keys.ENTER);
        // Relative Locator kullanarak Hybrid Bikes üstündeki Road Bikes'a tıklayalım
        WebElement hybridBikes = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));

        WebElement roadBikes = driver.findElement(with(By.tagName("span")).above(hybridBikes));

        roadBikes.click();

        // sayfayı kapatın
        driver.close();







    }
}

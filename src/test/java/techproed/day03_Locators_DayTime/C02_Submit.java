package techproed.day03_Locators_DayTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



        //amazon.com sayfasına git
        driver.get("https://www.amazon.com");

        //arama kutusunu locate ediniz ve Nutella aratınız.

        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));

        aramakutusu.sendKeys("Nutella"+ Keys.ENTER);
        aramakutusu.submit();

        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+Keys.Enter);
        /*
        Eğer bir webelement'i birden fazla kullanmayacaksanız bir webelemente assaing etmeyebilirsiniz.r+

         */

        Thread.sleep(2000);


    }
}

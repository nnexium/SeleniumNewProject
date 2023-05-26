package techproed.day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        System.out.println("Amazon Sayfa Başlığı: " + driver.getTitle());
        System.out.println("Amazon Actual Url = " + driver.getCurrentUrl());

        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Sayfa Başlığı: " + driver.getTitle());//getTitle() methodu Sayfa başlığını verir

        //getCurrentUrl() gidilen sayfanın url'ini verir
        System.out.println("Techproed Actual Url = " + driver.getCurrentUrl());



    }
}

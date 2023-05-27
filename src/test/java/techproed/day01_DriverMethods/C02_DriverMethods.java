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

        //getPageSource() Açılan sayfanın kaynak kodlarını verir
        //System.out.println(driver.getPageSource());Bilerek yoruma aldık her çalıştırdığımızda konsola bütün kaynak kodlarını vereceği için

        //getWindowHandle() Gidilen sayfanın handle değerini(hashKod) verir. Bu handle değerini sayfalar arası geçiş için kullanırız
        System.out.println("Techproed Window Handle Değeri : "+driver.getWindowHandle());//156B7B83BB29C993FACBBE3CBBFDFD5F



    }
}

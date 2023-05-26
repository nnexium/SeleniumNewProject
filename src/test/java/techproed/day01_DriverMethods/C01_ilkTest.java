package techproed.day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Javara uygulamalarında system özelliklerini ayarlamak icin setProperty methodu ile kullanırız.
        //setProperty methodu ile classımıza driverin fiziki yolunu belirtiriz
        System.out.println(System.getProperty("chromeDriver"));
        //getPropetrty ile "Key" degerini girerek "value" ya ulaşabilirim
        WebDriver driver = new ChromeDriver();
        //ChromeDriver türünde yeni bir obje oluşturduk
        driver.get("https://techproeducation.com");//String olarak girilen url'e gider
    }
}

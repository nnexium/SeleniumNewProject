package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu= " + driver.manage().window().getPosition());
        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın konumu= " + driver.manage().window().getSize());
        //Browser'ı maximize yapalım
        driver.manage().window().maximize();
        /*
        Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. ve açılan browserdaki webElementlere
        browser maximize olmadığı için  ulaşamayabilirz.Dolayısıyla browser'ı açtıktan sonra
        maximize yaparsar driver bütün webelementleri görür ve rahatlıkla müdahale edebilir.Bu yüzden browser'ı
        açtıktan sonra ilk olarak  driver.manage().window().maximize(); yapmamız bizim webelementlere
        ulaşmada işimizi kolaylaştırır.Böylelikle fail almamış oluruz.
         */
        //Techproeducation sayfasına gidelim
        driver.get("http://www.techproeducation.com");
        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu= " + driver.manage().window().getPosition());
        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın konumu= " + driver.manage().window().getSize());
        Thread.sleep(3000);
        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);
        //Sayfayı fullScreen yapalım
        driver.manage().window().fullscreen();

        driver.manage().window().setPosition(new Point(50,50));//istediğiniz konuma getirin
        driver.manage().window().setSize(new Dimension(600,600)); //Istedigimiz genislige getirir
        Thread.sleep(3000);
        //sayfayı kapatınız
        driver.close();






    }
}

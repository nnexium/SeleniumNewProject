package techproed.day04_Locators_DayTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C02_WebElementLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));




        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike" yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike" + Keys.ENTER);
        //id="twotabsearchtextbox" almak için sırayla CTRL+C ,  CTRL+F ve CTRL+V yapıyoruz.
        //sadece id kismini almak icin alacağımız yerin üstünü çift tıklariz.
        //sendKeys(); yazi göndermek icin kullanilir
        //Keys.ENTER --enter a bas
        //Bu yöntem, bir web sayfasındaki bir metin giriş alanına veri göndermek için kullanılır.

        // sonuc yazısını yazdırın
        List<WebElement> sonucYazilari = driver.findElements(By.className("sg-col-inner"));
        //unique olmadigi icin findElements() kullandik. "sg-col-inner" yazisindan 120 tane var.

        WebElement sonucYazisi = sonucYazilari.get(0);
        //bizim kullanacagimiz "sg-col-inner" yazisi-sonuc yazisi index i 0

        //System.out.println(sonuYazisi);//referans verir
        //[[ChromeDriver: chrome on WINDOWS (ae9cd0ac285e22eb696319db2be429f3)] -> class name: sg-col-inner]

        System.out.println(sonucYazisi.getText());//sonucu String olarak verir
        //1-16 of 184 results for "city bike"
        // sonuc sayısını yazdırın
        String sonucSayisi [] = sonucYazisi.getText().split(" ");
        System.out.println("sonucSayisi = " + Arrays.toString(sonucSayisi));

        System.out.println(sonucSayisi[2]);

        // ilk ürünün locatini alın
       List<WebElement> sonuclar= driver.findElements(By.className("s-image"));
       WebElement ilkUrun=sonuclar.get(0);


        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isDisplayed());
        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isEnabled());
        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isSelected());
        // ilk urune tıklayın

        ilkUrun.click();
        // sayfayı kapatın

        driver.close();



    }
}

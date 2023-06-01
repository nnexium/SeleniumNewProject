package techproed.day05_XpathCssSelector_DayTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusuna "city bike"  yazıp aratın
     //   WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        //2.yol
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
        // Hybrid Bikes bölümüne tıklayın
      //  WebElement hybrid = driver.findElement(By.xpath("//*[@class='a-list-item']"));
        //2.yol
        WebElement hybrid = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
        hybrid.click();
        // sonuc sayısını yazdırın
        WebElement sonucYazisi = driver.findElement(By.xpath("//span[text()='14 results for']"));
        System.out.println(sonucYazisi.getText());

        String sonucSayisi[] =   sonucYazisi.getText().split(" ");
        System.out.println("Sonuc Sayisi " + sonucSayisi[0]);

        // ilk ürününe tıklayın
        WebElement ilkurun = driver.findElement(By.xpath("//*[@class='s-image']"));
        ilkurun.click();
        //Sayfayı kapatınız
        driver.close();

    }
}

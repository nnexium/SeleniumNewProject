package techproed.day03_Locators_NightTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findelements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Amazon sayfasına gidelim
        driver.get("http://www.amazon.com");
        //Sayfadaki linklerin sayısını ve linkleri yazdıralım
        /*
        findelement ile bir webelemente ulaşabilirken, birden fazla webelement icin findelements() methodunu
        kullanırız.Bu webelementlerin sayisina ulaşmak icin yada bu webelementlerin yazisini konsola yazdırabilmek icin
        List<Webelement> linklerinListesi = driver.findElements(By.locator("locator degeri")) olarak kullanırız.
         */

        List<WebElement> linklerinListesi = driver.findElements(By.tagName("a"));
        System.out.println("linklerinListesi.size() = " + linklerinListesi.size());
/*
        for (WebElement w:linklerinListesi ) {
           if (!w.getText().isEmpty())
            System.out.println("Linklerlistesi = " + w.getText());
        }
*/
        //Lambda ile yazdıralım
        linklerinListesi.forEach(link -> {if (!link.getText().isEmpty())
        {System.out.println(link.getText());}});

        //Shop deals in Electronics webElementinin yazısını yazdıralım
        System.out.println("**********************************************************");
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());

        driver.close();







    }
}

package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ByIdLocator {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu.com adresine gidin
        driver.get("https://www.testotomasyonu.com");

        // arama kutusuna phone yazip arattirin

        // bir webelementi kullanmak istiyorsak
        // oncelikle driver'a o elementi buldurup
        // kullanabilecegimiz bir obje olarak kaydetmeliyiz

        WebElement aramakutusu = driver.findElement(By.id("global-search"));

        aramakutusu.sendKeys("phone");

        aramakutusu.submit();

        // bulunan sonuc sayisini yazdirin

        WebElement sonucYaziElementi = driver.findElement(By.className("product-count-text"));

        // System.out.println(sonucYaziElementi);
        // webelementler direk yazdirilamaz
        // eger webelement uzerindeki yaziyi elde etmek istersek
        System.out.println(sonucYaziElementi.getText());

        // Arama sonucunda urun bulunabildigini test edin

        String sonucSayisiStr = sonucYaziElementi.getText().replaceAll("\\D","");

        int sonucSayisiInt = Integer.parseInt(sonucSayisiStr);

        if (sonucSayisiInt > 0){
            System.out.println("Arama testi PASSED");
        }else {
            System.out.println("Arama testi FAILED");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}

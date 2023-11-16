package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_navigateMethodlari {

    public static void main(String[] args) {


        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // testotomasyonu ana sayfaya gidin

        driver.get("https://testotomasyonu.com");

        // title'in Otomasyon icerdigini test edin

        String expectedTitleIcerik = "Otomasyon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("testotomasyonu title testi passed");
        }else {
            System.out.println("testotomasyonu title testi failed");
        }

        // sonra wisequarter ana sayfaya gidin
        driver.navigate().to("https://www.wisequarter.com");

        // Url'in wisequarter icerdigini test edin

        String expectedUrlIcerik = "wisequarter";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("wq url testi passed");
        }else {
            System.out.println("wq url testi failed");
        }
        // tekrar testotomasyonu sayfasina donun
        driver.navigate().back();

        // url'in otomasyon icerdigini test edin
        expectedUrlIcerik = "otomasyon";
        actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("testotomasyonu testi passed");
        }else {
            System.out.println("testotomasyonu testi failed");
        }

        // sayfayi kapatin
        driver.quit();
    }
}

package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_getMethodlari {

    public static void main(String[] args) throws InterruptedException {

        /*
             Selenium 4.12 versiyonu ile
             kendi Webdriver'ini da olusturabiliyor

             Yani artik disaridan bir webdriver tanimlama MECBURIYETI kalmadi

             ANCAK... sirketlerin pek cogu kendilerine ozel olarak
             satin aldiklari webdriver'lari kullanabiliyor

             Biz bu duruma alismak icin
             Selenium webdriver yerine indirdigimiz driver.exe dosyasini kullanmaya devam edecegiz
        */
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.testotomasyonu.com");

        // System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle()); // 7F13E3FC65E25A1D0F6C1FCE75F88EB7
        // window handle degeri : selenium'un olusturdugu her webdriver objesine verdigi
        //                        unique bir kod'dur
        //                        biz bu degerleri birden fazla sayfa acilirsa, sayfalar arasinda gecis yapmak icin kullanacagiz

        System.out.println(driver.getWindowHandles()); // [B7E661DD18DF651E4806EF7F03AF0B62]
        // aktif webdriver objesinin actigi TUM SAYFALARIN window handle degerlerini getirir

        driver.quit();
    }
}

package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day01_02 {
     /*
     . .Exercise2...
   1-Driver oluşturalim
   2-Java class'imiza chnomedriver.exet i tanitalim
   3-Driver'in tum ekranı kaplamasini saglayalim
   4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
   5-"https://www.otto.de” adresine gidelim
   6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
   7-Title ve url inin "0TT0” kelimesinin içerip icermedigini kontrol edelim
   8-Ardindan "https://wisequarter.com/” adresine gidip
   9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
   10-Bir onceki web sayfamiza geri donelim
   11-Sayfayı yenileyelim
   12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
   13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.otto.de");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String expectedTitleOrURL = "OTTO";
        if (title.contains(expectedTitleOrURL) && url.contains(expectedTitleOrURL)){
            System.out.println("title or url test passed");
        }else {
            System.out.println("title or url test failed");
        }
        driver.navigate().to("https://wisequarter.com/");

        driver.quit();
    }
}

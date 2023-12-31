package day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebdriverOlusturma {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        // Bu satir olusturacagimiz webdriver'in ozelliklerini set ediyor
        // webdriver otomasyon sirasinda bizim elimiz, gozumuz, her seyimizdir

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        Thread.sleep(5000);

        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.close();

        driver.quit();
    }
}

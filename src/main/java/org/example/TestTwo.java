package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestTwo {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        //inicializacja wait-a
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //maksymalizacja okna
        driver.manage().window().maximize();
        //przejscie pod wskazany adres URL
        driver.get("https://weathershopper.pythonanywhere.com/");
        //Wyszukanie wartości
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn.btn-primary")));
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
//        driver.findElement(By.xpath("//div[@class='text-center col-4']//button[@class='btn btn-primary']")).click();
        //Weryfikacja rezultatu
//        boolean basket = driver.findElement(By.xpath("//span[@id='cart'][contains(text(),'1 item(s)')]")).isDisplayed();
        driver.findElement(By.xpath("//p[@class=\"ws_copyright\"]//a")).click();
//        if( basket == true) {
//            System.out.println("Sukces!");
//        } else {
//            System.out.println("Coś poszło nie tak...");
//        }

        //Zamknij przeglądarkę
        driver.quit();

    }
}
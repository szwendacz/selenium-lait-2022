package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestFour {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //maksymalizacja okna

        driver.manage().window().maximize();


        //Uruchom strone
        driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");

        //Przeslij wartosci i kliknij przycisk
        driver.findElement(By.id("isAgeSelected")).click();

        //Zweryfikuj rezultat
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='txtAge']"))));
        Boolean message_is_displayed = driver.findElement(By.xpath("//div[@id='txtAge']")).isDisplayed();
        Assert.assertTrue(message_is_displayed);

        //Zamknij przegladarke
        driver.quit();
    }
}

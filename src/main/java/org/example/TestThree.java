package org.example;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;

public class TestThree {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        //maksymalizacja okna

        driver.manage().window().maximize();

        //Uruchom strone
        driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");

        //Przeslij wartosci i kliknij przycisk
//        driver.findElement(By.id("sum1")).sendKeys("2");
//        driver.findElement(By.id("sum2")).sendKeys("5");
//        driver.findElement(By.xpath("//*[@id='gettotal']/button")).click();

//        //Zweryfikuj rezultat
////        boolean result = driver.findElement(By.xpath("//*[@id=\'addmessage\']")).isDisplayed();
//        String result = driver.findElement(By.xpath("//*[@id=\'addmessage\']")).getText();
//        System.out.println(result);
//        Assert.assertEquals("9", result);
        String success_info = "Day selected :- Monday";
        // znajdujemy element typu select
        WebElement selectElement = driver.findElement(By.id("select-demo"));
        // definiujemy obiekty typu select i przekazujemy mu znaleziony wczesniej webelement
        Select selectObject = new Select(selectElement);
        // wybieramy za pomoca wartosci value
        selectObject.selectByValue("Monday");



        Thread.sleep(1000);
        String website_info = driver.findElement(By.xpath("//p[@class='selected-value text-size-14']")).getText();




        //Zamknij przegladarke
        driver.quit();
    }
}
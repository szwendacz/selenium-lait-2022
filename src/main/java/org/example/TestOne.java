package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


// Implicit wait - prosty, działa globalnie, ustawiamy raz, każde wywołanie metody findElement, wydłuża czas wykonywania testów, małe projekty
// Explicit Wait - skomplikowany, ustawiany na konkretny element i akcje
// FluentWait - skomplikowany, definjujemy maksymalny czas oczekiwania i częstotliwość odpytywania

public class TestOne {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://weathershopper.pythonanywhere.com/");
        WebElement addButton = driver.findElement(By.className("btn-primary"));
        String title_main = driver.getTitle();
        System.out.println(title_main);
        addButton.click();
        String title_category = driver.getTitle();
        System.out.println(title_category);
        WebElement addButtonCategoryPage = driver.findElement(By.className("btn-primary"));
        addButtonCategoryPage.click();
        driver.quit();
    }
}

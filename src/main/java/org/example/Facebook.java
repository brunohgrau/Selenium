package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\bruno\\Desktop\\Java\\chrome-driver-certo\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("my own xpath");
//        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("hello");
        driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("my name");
        driver.findElement(By.cssSelector("input[name = 'pass']")).sendKeys("my pass");
        driver.findElement(By.cssSelector("[value='1']")).click();

    }
}

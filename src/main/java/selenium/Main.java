package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno\\Desktop\\Java\\chrome-driver-certo\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String siteGoogle = "https://www.google.com/";
        String siteYahoo = "https://br.search.yahoo.com/";
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("This is my first code");
        driver.findElement(By.id("pass")).sendKeys("12345");
        driver.findElement(By.linkText("Esqueceu a senha?")).click();










    }
}

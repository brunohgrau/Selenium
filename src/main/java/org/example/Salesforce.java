package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Salesforce {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\bruno\\Desktop\\Java\\chrome-driver-certo\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String siteSalesforce = "https://login.salesforce.com/";
        driver.get(siteSalesforce);

        driver.findElement(By.id("username")).sendKeys("This is my first code");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345");
//        driver.findElement(By.name("pw")).sendKeys("12345");
//        driver.findElement(By.className("button r4 wide primary")).click();
//        driver.findElement(By.linkText("Esqueceu a senha?")).click();
        driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());


    }
}

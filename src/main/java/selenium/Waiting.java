package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Waiting {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\bruno\\Desktop\\Java\\chrome-driver-certo\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Implicit Wait

//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        WebElement landscape = driver.findElement(By.id("landscape"));
//        assertThat(landscape.getAttribute("src"))
//                .containsIgnoringCase("landscape");

        // Explicit Wait

//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        WebElement landscape = wait.until(ExpectedConditions
//                .presenceOfElementLocated(By.id("landscape")));
//        assertThat(landscape.getAttribute("src"))
//                .containsIgnoringCase("landscape");

        // Fluent Wait


//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);
//
//        WebElement landscape = wait.until(ExpectedConditions
//                .presenceOfElementLocated(By.id("landscape")));
//        assertThat(landscape.getAttribute("src"))
//                .containsIgnoringCase("landscape");
    }

}










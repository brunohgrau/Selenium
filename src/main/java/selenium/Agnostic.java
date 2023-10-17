package selenium;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Agnostic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\bruno\\Desktop\\Java\\chrome-driver-certo\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

         //Scrolling

        driver.get(
                "https://bonigarcia.dev/selenium-webdriver-java/long-page.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String script = "window.scrollBy(0, 1000);";
        js.executeScript(script);

        // Scrolling to a given element

//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/long-page.html");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        WebElement lastElememt = driver
//                .findElement(By.cssSelector("p:last-child"));
//        String script = "arguments[0].scrollIntoView();";
//        js.executeScript(script, lastElememt);

        // Infinite Scrolling

//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/infinite-scroll.html");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        By pLocator = By.tagName("p");
//        List<WebElement> paragraphs = wait.until(
//                ExpectedConditions.numberOfElementsToBeMoreThan(pLocator, 0));
//        int initParagraphsNumber = paragraphs.size();
//
//        WebElement lastParagraph = driver.findElement(
//                By.xpath(String.format("//p[%d]", initParagraphsNumber)));
//        String script = "arguments[0].scrollIntoView();";
//        js.executeScript(script, lastParagraph);
//        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(pLocator,
//                initParagraphsNumber));

        //Color Picker

//        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        WebElement colorPicker = driver.findElement(By.name("my-colors"));
//        String initColor = colorPicker.getAttribute("value");
//
//        log.debug("The initial color is {}", initColor);
//
//        Color red = new Color(255, 0, 0, 1);
//        String script = String.format(
//                "arguments[0].setAttribute('value', '%s');", red.asHex());
//        js.executeScript(script, colorPicker);
//
//        String finalColor = colorPicker.getAttribute("value");
//        log.debug("The final color is {}", finalColor);
//        assertThat(finalColor).isNotEqualTo(initColor);
//        assertThat(Color.fromString(finalColor)).isEqualTo(red);

    // Pinned Scripts

//        String initPage = "https://bonigarcia.dev/selenium-webdriver-java/";
//        driver.get(initPage);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        ScriptKey linkKey = js
//                .pin("return document.getElementsByTagName('a')[2];");
//        ScriptKey firstArgKey = js.pin("return arguments[0];");
//
//        Set<ScriptKey> pinnedScripts = js.getPinnedScripts();
//        assertThat(pinnedScripts).hasSize(2);
//
//        WebElement formLink = (WebElement) js.executeScript(linkKey);
//        formLink.click();
//        assertThat(driver.getCurrentUrl()).isNotEqualTo(initPage);
//
//        String message = "Hello world!";
//        String executeScript = (String) js.executeScript(firstArgKey, message);
//        assertThat(executeScript).isEqualTo(message);
//
//        js.unpin(linkKey);
//        assertThat(js.getPinnedScripts()).hasSize(1);

        // Async Java

//        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        Duration pause = Duration.ofSeconds(2);
//        String script = "const callback = arguments[arguments.length - 1];"
//                + "window.setTimeout(callback, " + pause.toMillis() + ");";
//
//        long initMillis = System.currentTimeMillis();
//        js.executeAsyncScript(script);
//        Duration elapsed = Duration
//                .ofMillis(System.currentTimeMillis() - initMillis);
//        log.debug("The script took {} ms to be executed", elapsed.toMillis());
//        assertThat(elapsed).isGreaterThanOrEqualTo(pause);

        //  Page Load Timeout
//
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(1));
//
//        assertThatThrownBy(() -> driver
//                .get("https://bonigarcia.dev/selenium-webdriver-java/"))
//                .isInstanceOf(TimeoutException.class);


        // Script Loading Timeout

//        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(3));
//        assertThatThrownBy(() -> {
//            long waitMillis = Duration.ofSeconds(5).toMillis();
//            String script = "const callback = arguments[arguments.length - 1];"
//                    + "window.setTimeout(callback, " + waitMillis + ");";
//            js.executeAsyncScript(script);
//        }).isInstanceOf(ScriptTimeoutException.class);


        //  Tale a Screenshoot

//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
//
//        WebElement form = driver.findElement(By.tagName("form"));
//        File screenshot = form.getScreenshotAs(OutputType.FILE);
//        Path destination = Paths.get("webelement-screenshot.png");
//        Files.move(screenshot.toPath(), destination, REPLACE_EXISTING);
//
//        assertThat(destination).exists();

        // Change Browser Size

//        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
//        WebDriver.Window window = driver.manage().window();
//
//        Point initialPosition = window.getPosition();
//        Dimension initialSize = window.getSize();
//        window.maximize();
//
//        Point maximizedPosition = window.getPosition();
//        Dimension maximizedSize = window.getSize();
//
//
//        assertThat(initialPosition).isNotEqualTo(maximizedPosition);
//        assertThat(initialSize).isNotEqualTo(maximizedSize);

        // Test History

//        String baseUrl = "https://bonigarcia.dev/selenium-webdriver-java/";
//        String firstPage = baseUrl + "navigation1.html";
//        String secondPage = baseUrl + "navigation2.html";
//        String thirdPage = baseUrl + "navigation3.html";
//
//        driver.get(firstPage);
//
//        driver.navigate().to(secondPage);
//        driver.navigate().to(thirdPage);
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//
//        assertThat(driver.getCurrentUrl()).isEqualTo(thirdPage);

    //  Reading Shadow Dom

//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html");
//
//        WebElement content = driver.findElement(By.id("content"));
//        SearchContext shadowRoot = content.getShadowRoot();
//        WebElement textElement = shadowRoot.findElement(By.cssSelector("p"));
//        assertThat(textElement.getText()).contains("Hello Shadow DOM");

    // Read Existing Cookies

//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/cookies.html");
//
//        WebDriver.Options options = driver.manage();
//        Set<Cookie> cookies = options.getCookies();
////        assertThat(cookies).hasSize(2);
//
//        Cookie username = options.getCookieNamed("username");
//        assertThat(username.getValue()).isEqualTo("John Doe");
//        assertThat(username.getPath()).isEqualTo("/");
//
//        driver.findElement(By.id("refresh-cookies")).click();

    // Add New Cookies

//        driver.get("https://bonigarcia.dev/selenium-webdriver-java/cookies.html");
//
//        WebDriver.Options options = driver.manage();
//        Cookie newCookie = new Cookie("new-cookie-key", "new-cookie-value");
//        options.addCookie(newCookie);
//        String readValue = options.getCookieNamed(newCookie.getName())
//                .getValue();
//        assertThat(newCookie.getValue()).isEqualTo(readValue);
//
//        driver.findElement(By.id("refresh-cookies")).click();

    // Edit Existing Cookies
//
//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/cookies.html");
//        WebDriver.Options options = driver.manage();
//        Cookie username = options.getCookieNamed("username");
//        Cookie editedCookie = new Cookie(username.getName(), "new-value");
//        options.addCookie(editedCookie);
//
//        Cookie readCookie = options.getCookieNamed(username.getName());
//        assertThat(editedCookie).isEqualTo(readCookie);
//
//        driver.findElement(By.id("refresh-cookies")).click();

    // Test Delete Existing Cookies

//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/cookies.html");
//
//        WebDriver.Options options = driver.manage();
//        Set<Cookie> cookies = options.getCookies();
//        Cookie username = options.getCookieNamed("username");
//        options.deleteCookie(username);
//
////        assertThat(options.getCookies()).hasSize(cookies.size() - 1);
//
//        driver.findElement(By.id("refresh-cookies")).click();

    }
}












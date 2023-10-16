package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Actions2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\bruno\\Desktop\\Java\\chrome-driver-certo\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Clicking onLinks

//        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
//
//        driver.findElement(By.xpath("//a[text()='Navigation']")).click();
//        driver.findElement(By.xpath("//a[text()='Next']")).click();
//        driver.findElement(By.xpath("//a[text()='3']")).click();
//        driver.findElement(By.xpath("//a[text()='2']")).click();
//        driver.findElement(By.xpath("//a[text()='Previous']")).click();
//
//        String bodyText = driver.findElement(By.tagName("body")).getText();
//        assertThat(bodyText).contains("Lorem ipsum");



        // Right Click and Double CLick

//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");
//        Actions actions = new Actions(driver);
//
//        WebElement dropdown2 = driver.findElement(By.id("my-dropdown-2"));
//        actions.contextClick(dropdown2).build().perform();
//        WebElement contextMenu2 = driver.findElement(By.id("context-menu-2"));
//        assertThat(contextMenu2.isDisplayed()).isTrue();
//
//        WebElement dropdown3 = driver.findElement(By.id("my-dropdown-3"));
//        actions.doubleClick(dropdown3).build().perform();
//        WebElement contextMenu3 = driver.findElement(By.id("context-menu-3"));
//        assertThat(contextMenu3.isDisplayed()).isTrue();




        // Mouseover
//
//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/mouse-over.html");
//        Actions actions = new Actions(driver);
//
//        List<String> imageList = Arrays.asList("compass", "calendar", "award",
//                "landscape");
//        for (String imageName : imageList) {String xpath = String.format("//img[@src='img/%s.png']", imageName);
//            WebElement image = driver.findElement(By.xpath(xpath));
//            actions.moveToElement(image).build().perform();
//
//            WebElement caption = driver.findElement(
//                    RelativeLocator.with(By.tagName("div")).near(image));
//
//            assertThat(caption.getText()).containsIgnoringCase(imageName);


        // Drag and Drop


//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/drag-and-drop.html");
//        Actions actions = new Actions(driver);
//
//        WebElement draggable = driver.findElement(By.id("draggable"));
//        int offset = 100;
//        Point initLocation = draggable.getLocation();
//        actions.dragAndDropBy(draggable, offset, 0).dragAndDropBy(draggable, 0, offset)
//                .dragAndDropBy(draggable, -offset, 0)
//                .dragAndDropBy(draggable, 0, -offset).build().perform();
//        assertThat(initLocation).isEqualTo(draggable.getLocation());
//
//        WebElement target = driver.findElement(By.id("target"));
//        actions.dragAndDrop(draggable, target).build().perform();
//        assertThat(target.getLocation()).isEqualTo(draggable.getLocation());

        // Click and Hold

//
//        driver.get(
//                "https://bonigarcia.dev/selenium-webdriver-java/draw-in-canvas.html");
//        Actions actions = new Actions(driver);
//
//        WebElement canvas = driver.findElement(By.tagName("canvas"));
//        actions.moveToElement(canvas).clickAndHold();
//
//        int numPoints = 10;
//        int radius = 30;
//        for (int i = 0; i <= numPoints; i++) {
//            double angle = Math.toRadians(360 * i / numPoints);
//            double x = Math.sin(angle) * radius;double y = Math.cos(angle) * radius;
//            actions.moveByOffset((int) x, (int) y);
//        }
//
//        actions.release(canvas).build().perform();


    }



}










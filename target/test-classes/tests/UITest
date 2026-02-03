package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;

public class UITest {

    @Test
    public void validateTitle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        File htmlFile = new File("src/main/resources/static/index.html");
        driver.get(htmlFile.getAbsolutePath());

        String titleText = driver.findElement(
                org.openqa.selenium.By.id("title")).getText();

        System.out.println("Title: " + titleText);
        driver.quit();
    }
}

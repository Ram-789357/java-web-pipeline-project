package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class UITest {

    @Test
    public void testUI() {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Test local built file
        driver.get("file:///C:/Users/YOURUSER/.jenkins/workspace/YOURJOB/target/classes/static/index.html");

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}

package org.example.StepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
// this page to load driver instead of load every time now just call
    @Before
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
       // driver.manage().window().setSize(new Dimension(1024,768));// to set resolution 1024x768px
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));//this time to write verify chars manually
        driver.get("https://www.amazon.com/");
    }

    @After
    public void tearDown() throws InterruptedException {
//    driver.close();
//    Thread.sleep(50000);
    }
}

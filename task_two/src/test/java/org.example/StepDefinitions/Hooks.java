package org.example.StepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setup() {

        driver = new ChromeDriver();
        //driver.manage().window().setSize(new Dimension(1024, 768)); // To set resolution 1024x768px
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
    }

    @After
    public void tearDown() {

    }
}

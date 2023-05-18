package mokivezi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class MokiVeziBase {
    protected static WebDriver driver;
    protected static Wait<WebDriver> wait;

    public MokiVeziBase() {
        System.setProperty("webdriver.chrome.driver\\", "C:\\Users\\д\\Downloads\\Naujas aplankas\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
    }

    @BeforeEach
    public void setup() {
        driver.get("https://mokivezi.lt/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
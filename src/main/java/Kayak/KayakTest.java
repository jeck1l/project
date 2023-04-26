package Kayak;

import Kayak.KayakBase;
import Kayak.KayakHome;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KayakTest extends KayakBase {

    private static WebDriver driver;

    public KayakTest() {
        super(driver);
    }

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/д/Downloads/Naujas aplankas/chromedriver_win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
    }

    @Test
    public void KayakStayTest(){
        KayakHome kayakHome = new KayakHome(driver);
        kayakHome.goTo();
        kayakHome.stays();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
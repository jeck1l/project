package Kayak;

import Kayak.KayakBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KayakHome extends KayakBase {

//    private static final By stayButton = By.xpath("//*[@id=\"DAs3\"]/div/div[2]/nav[2]/div/a[2]");
        private static final By stayButton = By.cssSelector(".hsCY-active");
    public KayakHome(WebDriver driver) {
        super(driver);
    }

    public static void goTo() {
        driver.get("https://www.kayak.com/");
    }

    public static void stays() {
        WebDriverWait stayButtonWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement stay = stayButtonWait.until(ExpectedConditions.elementToBeClickable(stayButton));
            stay.click();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("stay button is not displayed.");
        }

    }
}

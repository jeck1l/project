package mokivezi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PageLoadTest extends MokiVeziBase {

    @BeforeEach
    public void setUp() {
        driver.get("https://mokivezi.lt/");
    }

    @Test
    public void testPageLoadTime() {
        long start = System.currentTimeMillis();

        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState=='complete';"));

        long finish = System.currentTimeMillis();
        long totalTime = finish - start;

        System.out.println("Testas1: Užkrovimo testas: " + totalTime + " milisekundes");

        assertNotNull(driver.getTitle());
    }

    @AfterEach
    public void tearDown() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
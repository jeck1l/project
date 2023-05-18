package mokivezi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductSearchTest extends PageLoadTest {

    @BeforeEach
    public void setUp() {
        driver.get("https://mokivezi.lt/");
    }

    @Test
    public void testProductSearch() {
        try {
            WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
            searchBox.sendKeys("vanta");

            WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div[1]/div/nav/div[2]/div[2]/form/div[2]/button")));
            searchButton.click();

            WebElement searchResult = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"product-item-1033441\"]/div[1]/div/h6/a")));
            assertNotNull(searchResult);

            System.out.println("Test2: Prekės paieškos testas");
        } catch (Exception e) {
            System.out.println("Test2: Prekės neranda :( " + e.getMessage());
        }
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
package mokivezi;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductSearchTest extends MokiVeziBase {

    public ProductSearchTest() {
        super();
    }

    @Before
    public void setUp() {
        driver.get("https://mokivezi.lt");
    }

    @Test
    public void testProductSearch() {
        try {
            WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
            searchBox.sendKeys("vanta");

            WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div[1]/div/nav/div[2]/div[2]/form/div[2]/button")));
            searchButton.click();

            WebElement searchResult = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("CSS_SELECTOR_PAVADINIMUI")));
            Assert.assertNotNull(searchResult);

            System.out.println("Prekė rasta!");
        } catch (Exception e) {
            System.out.println("Prekės neranda :( " + e.getMessage());
        }
    }


    @After
    public void tearDown() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    public static void main(String[] args) {
        ProductSearchTest test = new ProductSearchTest();
        test.setUp();
        test.testProductSearch();
        test.tearDown();
    }
}

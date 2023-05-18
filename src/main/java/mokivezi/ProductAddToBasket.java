package mokivezi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.beans.Expression;

public class ProductAddToBasket extends ProductSearchTest {

    @BeforeEach
    public void setUp() {
        driver.get("https://mokivezi.lt/");
    }

    @Test
    public void testAddToCart() {
        super.testProductSearch();
        try {

            WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".item-add-to-cart , .product-card__img-container")));
            product.click();

            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".product-quantity__submit")));
            addToCartButton.click();

            WebElement continute = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[3]/button")));
            continute.click();

            System.out.println("Test2: Prekės pridėjiimo į krepšelį testas");
        } catch (Exception e) {
            System.out.println("Test2: Prekės nepridėjo " + e.getMessage());
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

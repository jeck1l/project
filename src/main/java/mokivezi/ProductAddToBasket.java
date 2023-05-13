package mokivezi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class ProductAddToBasket extends ProductSearchTest {

    public ProductAddToBasket() {
        super();
    }

    @Test
    public void testAddToCart() {
        super.testProductSearch();
        try {

            WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".item-add-to-cart , .product-card__img-container")));
            product.click();


            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".product-quantity__submit")));
            addToCartButton.click();


            System.out.println("Test2: Prekė pridėtą į krepšelį");
        } catch (Exception e) {
            System.out.println("Test2: Prekės nepridėjo " + e.getMessage());
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
        ProductAddToBasket test = new ProductAddToBasket();
        test.setUp();
        test.testAddToCart();
        test.tearDown();
    }
}

package mokivezi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductRemoveFromBasket extends ProductAddToBasket {

    @BeforeEach
    public void setUp() {
        driver.get("https://mokivezi.lt/");
    }

    @Test
    public void testRemoveFromCart() {
        super.testAddToCart();
        try {

            WebElement cartIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div[2]/div/div/nav/div[3]/div/div[1]/div/div[1]/span[1]")));
            cartIcon.click();

            WebElement removeFromCartButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div[2]/div/div/nav/div[3]/div/div[1]/div/div[2]/div[3]/a[1]")));
            removeFromCartButton2.click();

            WebElement removeFromCartButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cart-item-remove-button\"]")));
            removeFromCartButton1.click();

            System.out.println("Test3: Prekės pašalinimo iš krepšelio testas");
        } catch (Exception e) {
            System.out.println("Test3: Prekės nepavyko pašalinti " + e.getMessage());
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
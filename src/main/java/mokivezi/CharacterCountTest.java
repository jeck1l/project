package mokivezi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CharacterCountTest extends MokiVeziBase {

    @BeforeEach
    public void setUp() {
        driver.get("https://mokivezi.lt/");
    }

    @Test
    public void testCharacterCount() {
        try {
            WebElement body = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
            String bodyText = body.getText();

            // Pašaliname tarpus ir skaičiuojame likusius simbolius
            String noSpaces = bodyText.replace(" ", "");
            int characterCount = noSpaces.length();

            System.out.println("Testas: Raidžių skaičiavimas. Raidžių skaičius yra: " + characterCount);
        } catch (Exception e) {
            System.out.println("Testas nepavyko: " + e.getMessage());
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

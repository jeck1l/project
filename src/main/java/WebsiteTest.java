import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class WebsiteTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/д/Downloads/Naujas aplankas/chromedriver_win32/chromedriver.exe");
        WebsiteTest test1 = new WebsiteTest();
        test1.rdeSearch();
    }
    public void rdeSearch() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rde.lt/");

        String[] searchTerms = {"klaviatura", "suo", "skalbimo"};

        for (String term : searchTerms) {
            WebElement searchBox = driver.findElement(By.xpath("/html/body/main/header/div/form/input"));
            searchBox.clear();
            searchBox.sendKeys(term);
            searchBox.sendKeys(Keys.RETURN);

            String expectedValue = term + " - Internetinė parduotuvė RDE.LT";
            String actualValue = driver.getTitle();
            assertEquals(expectedValue, actualValue);

            // Grįžti į pradinį puslapį
            driver.navigate().back();
        }

        driver.quit();
    }
}

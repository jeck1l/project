package mokivezi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class DidmeninePrekybaDB {
    private WebDriver driver;

    public DidmeninePrekybaDB() {
        System.setProperty("webdriver.chrome.driver", "kelias iki webdriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public List<String> scrapeData() {
        driver.get("https://mokivezi.lt/didmenine-prekyba");

        List<WebElement> elements = driver.findElements(By.cssSelector(""));
        List<String> data = new ArrayList<>();
        for (WebElement element : elements) {
            data.add(element.getText());
        }

        driver.quit();

        return data;
    }
}
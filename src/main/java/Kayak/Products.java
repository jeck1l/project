package Kayak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.sql.*;
import java.util.List;

public class Products extends KayakBase {

    public DbConnection db;
    private final By products = By.cssSelector(".FNY6-title , .KzeV-description]");

    public Products(WebDriver driver) {
        super(driver);
        db = new DbConnection();
    }

    public void goTo(){
        driver.get("https://www.kayak.com/");
    }
    public void kayakList() {
        List<WebElement> productlist = driver.findElements(products);

        try {
            String sql = "INSERT INTO hotels(hotel_title) VALUES(?)";
            PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
            for (WebElement title : productlist) {
                pstmt.setString(1, title.getText());
                pstmt.executeUpdate();
            }
            System.out.println("Data inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws SQLException {
        DbConnection dbConnection = new DbConnection();
        dbConnection.createTable();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        KayakBase.driver = new ChromeDriver(options);
        Products products1 = new Products(driver);
        products1.goTo();
        products1.kayakList();
        driver.quit();
    }
}

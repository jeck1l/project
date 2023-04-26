package Kayak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.sql.*;
import java.util.List;

public class Products extends KayakBase {

    private DbConnection db;
    private final By products = By.xpath("//*[@id=\"u9ts\"]/div/section[2]/div/div/div/div[2]");

    public Products(WebDriver driver) {
        super(driver);
        db = new DbConnection();
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

    public static void main(String[] args) {

    }
}

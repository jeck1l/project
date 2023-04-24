//Pigult.java
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class PigultAuth extends PigultWebsite {
//
//    private final By email = By.cssSelector(".register-details > form:nth-child(1) > div:nth-child(5) > input:nth-child(1)");
//    private final By password = By.cssSelector("#passwordContPopup > input:nth-child(2)");
//    private final By repeatPassword = By.cssSelector("#passwordContPopupRepeat > input:nth-child(2)");
//    private final By enterRegistration = By.cssSelector("div.reg-wrapper:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(13) > a:nth-child(1)");
//    private final By myUser = By.cssSelector("li.c-user-menu-item:nth-child(1) > a:nth-child(1)");
//    private final By cookie = By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/button[3]");
//    private final  By checkPolicy = By.cssSelector("div.icheckbox:nth-child(2)");
//
//    private final By regButton = By.cssSelector("div.form-controls:nth-child(9) > input:nth-child(1)");
//
//    private final  By agreement = By.cssSelector("#policiesButtonApprove");
//    public PigultAuth(WebDriver driver) {
//        super(driver);
//    }
//
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/HackedSoul/IdeaProjects/seleniumPage/webdriver/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        PigultWebsite pigultWebsite = new PigultWebsite(driver);
//        pigultWebsite.goTo();
//        PigultAuth reg = new PigultAuth(driver);
//        reg.acceptCookie();
//        reg.registration();
//    }
//    public void acceptCookie(){
//        WebElement cookieButton = driver.findElement(cookie);
//        cookieButton.click();
//    }
//
//    public void registration() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement user = driver.findElement(myUser);
//        user.click();
//        WebElement registerActions = wait.until(ExpectedConditions.visibilityOfElementLocated(enterRegistration));
//        if (registerActions.isDisplayed()) {
//            registerActions.click();
//        } else {
//            System.out.println("Can't enter registration");
//        }
//        WebElement emailField = driver.findElement(email);
//        String emailData = "modestasvcs@gmail.com";
//        emailField.sendKeys(emailData);
//
//        WebElement passwordField = driver.findElement(password);
//        String passwordData = "AbVGt54AV7byyW8";
//        String passwordConfirmData = "AbVGt54AV7byyW8";
//        passwordField.sendKeys(passwordData);
//        WebElement passwordConfirm = driver.findElement(repeatPassword);
//        passwordConfirm.sendKeys(passwordConfirmData);
//
//        WebElement checkAgreement = driver.findElement(checkPolicy);
//        checkAgreement.click();
//        WebDriverWait waitForAgreement = new WebDriverWait(driver, Duration.ofSeconds(5));
//        WebElement acceptAgreement = waitForAgreement.until(ExpectedConditions.elementToBeClickable(agreement));
//        acceptAgreement.click();
//        WebDriverWait waitForRegButtton= new WebDriverWait(driver, Duration.ofSeconds(5));
//        WebElement finishRegistration = waitForRegButtton.until(ExpectedConditions.elementToBeClickable(regButton));
//        finishRegistration.click();
//        WebElement verifyEmail = driver.findElement(By.cssSelector("button.btn-primary"));
//        verifyEmail.sendKeys("599046");
//
//    }
//}
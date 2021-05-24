import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Form {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\work\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        submitForm(driver);
        waitForAlertBanner(driver);
        assertEquals(getBannerText(driver), "The form was successfully submitted!");
        driver.quit();
    }

    public static void submitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("First Name");
        driver.findElement(By.id("last-name")).sendKeys("Last Name");
        driver.findElement(By.id("job-title")).sendKeys("Job Title");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("05/24/2021");
        datePicker.sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector("a[href='/thanks']")).click();
    }

    public static void waitForAlertBanner(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert-success")));
    }

    public static String getBannerText(WebDriver driver) {
        return driver.findElement(By.cssSelector(".alert-success")).getText();
    }
}

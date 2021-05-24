import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ConfirmationPage;
import pages.FormPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Form {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\work\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        FormPage formPage = new FormPage();
        formPage.submitForm(driver);
        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);
        assertEquals(confirmationPage.getBannerText(driver), "The form was successfully submitted!");
        driver.quit();
    }

}

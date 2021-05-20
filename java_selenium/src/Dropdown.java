import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\work\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenuButton.click();
        Thread.sleep(1000);
        WebElement dropdownElement = driver.findElement(By.id("autocomplete"));
        dropdownElement.click();
        Thread.sleep(1000);
        driver.quit();
    }
}

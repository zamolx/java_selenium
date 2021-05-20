import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\work\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement checkBox1 = driver.findElement(By.cssSelector("#checkbox-1"));
        checkBox1.click();
        Thread.sleep(1000);
        WebElement checkBox2 = driver.findElement(By.cssSelector("input[id$='2']"));
        checkBox2.click();
        Thread.sleep(1000);
        WebElement checkBox3 = driver.findElement(By.cssSelector("input[value='checkbox-3']"));
        checkBox3.click();
        Thread.sleep(1000);
        driver.quit();
    }
}

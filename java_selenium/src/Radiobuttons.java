import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\work\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radiobutton_1 = driver.findElement(By.cssSelector("input[id^='radio-button']"));
        radiobutton_1.click();
        Thread.sleep(1000);
        WebElement radiobutton_2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radiobutton_2.click();
        Thread.sleep(1000);
        WebElement radiobutton_3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radiobutton_3.click();
        Thread.sleep(1000);
        driver.quit();
    }
}

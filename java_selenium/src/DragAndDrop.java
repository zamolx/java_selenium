import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\work\\webdriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement drag = driver.findElement(By.id("image"));
        WebElement drop = driver.findElement(By.id("box"));
        Actions dragdrop = new Actions(driver);
        dragdrop.dragAndDrop(drag, drop).build().perform();
        Thread.sleep(1000);
        driver.quit();

    }
}

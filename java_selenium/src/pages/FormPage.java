package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
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

}
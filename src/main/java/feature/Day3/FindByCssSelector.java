package feature.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindByCssSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // truy cap vao trang web
        driver.get("https://saucelabs.com/request-demo");

        // tim phan tu theo css selector: tat ca cac nut <button>
        List<WebElement> buttons = driver.findElements(By.cssSelector("button"));
                System.out.println("\nButtons:");
                for (WebElement button : buttons) {
                    System.out.println(button.getText());
                }

        // tim phan tu theo CSS selector: input co name la "Email"
        WebElement emailInput = driver.findElement(By.cssSelector("input[name='Email'"));
                emailInput.sendKeys("test@example.com");
    }
}

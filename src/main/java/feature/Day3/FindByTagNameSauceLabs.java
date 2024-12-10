package feature.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindByTagNameSauceLabs {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // truy cap vao trang web
        driver.get("https://www.saucelabs.com/request-demo");

        //tim the h1 va in noi dung
        WebElement header = driver.findElement(By.tagName("h1"));
        System.out.println("Header text: " + header.getText());

        //tim tat ca the '<p>' va in noi dung
        List<WebElement> paragraphs = driver.findElements(By.tagName("p"));
        System.out.println("\nParagraphs: ");
        for (WebElement paragraph : paragraphs) {
            System.out.println(paragraph.getText());
        }
    }
}

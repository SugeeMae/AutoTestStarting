package feature;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.RequestDemoPageUi;

public class TestDemo {
    static WebDriver driver = null;

    private static RequestDemoPageUi requestDemoPageUi = null;

    public TestDemo(RequestDemoPageUi requestDemoPageUi) {
        this.requestDemoPageUi = requestDemoPageUi;
    }

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucelabs.com/request-demo");
//        WebElement element = driver.findElement(By.linkText("Try it free"));
//        WebElement element = driver.findElement(By.partialLinkText("Try"));
        String getUrl = driver.getCurrentUrl();
//        System.out.println("Đường dẫn web là: "+ getUrl);
//        driver.quit();
//        element.click();
//        element.clear();

    }
}

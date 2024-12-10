package feature;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
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
        //requestDemoPageUi.findTalkButton().click();
        requestDemoPageUi.findInputEmail().click();
        driver.quit();
    }
}

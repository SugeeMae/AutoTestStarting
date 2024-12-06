package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://saucelabs.com/");
    }
    static WebDriver driver = null;
}
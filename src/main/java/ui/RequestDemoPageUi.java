package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class RequestDemoPageUi {
    private final WebDriver driver;

    public RequestDemoPageUi(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findLabelBook() {
        return driver.findElement(By.xpath("//span[contains(text(),'Book')]"));
    }
    public WebElement findLabelEmail() {
        return driver.findElement(By.xpath("//label[contains(@for,'Email')]"));
    }
    public WebElement findInputEmail() {
        return driver.findElement(By.xpath("//input[contains(@id,'Email')]"));
    }
    public WebElement findLabelCompany() {
        return driver.findElement(By.xpath("//label[contains(@for,'Company')]"));
    }
    public WebElement findInputCompany() {
        return driver.findElement(By.xpath("//input[contains(@id,'Company')]"));
    }
    public WebElement findLabelInterest() {
        return driver.findElement(By.xpath("//label[contains(@for,'Solution')]"));
    }
    public WebElement findInputInterest() {
        return driver.findElement(By.xpath("//input[contains(@id,'Solution')]"));
    }
    public WebElement findLabelComment() {
        return driver.findElement(By.xpath("//label[contains(@for,'Sale')]"));
    }
    public WebElement findInputComment() {
        return driver.findElement(By.xpath("//textarea[contains(@id,'Sale')]"));
    }
    public WebElement findCheckBox() {
        return driver.findElement(By.xpath("//label[contains(@for,'mkto')]"));
    }
    public WebElement findTalkButton() {
        return driver.findElement(By.xpath("//button[contains(text(),'Talk')]"));
    }
}

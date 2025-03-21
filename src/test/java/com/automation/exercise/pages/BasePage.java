package com.automation.exercise.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.automation.exercise.utils.ReadProperties.getWaitTimeOut;
import static com.automation.exercise.driver.DriverFactory.getDriver;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        driver = getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(getWaitTimeOut()));
        PageFactory.initElements(driver, this);
    }
    public void navigateToUrl(String url) {
        driver.get(url);
    }
    protected void click(WebElement button) {
        wait.until(ExpectedConditions.elementToBeClickable(button))
                .click();
    }
    protected void enterText(WebElement input, String text) {
        wait.until(ExpectedConditions.visibilityOf(input))
                .sendKeys(text);
    }
    protected String getText(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element))
                .getText();
    }
    private Alert getAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert();
    }
    protected String getAlertText() {
        return getAlert().getText();
    }
    protected void enterToAlertText(String text) {
        getAlert().sendKeys(text);
    }
    protected void waitFor(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}

package com.automation.exercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.automation.exercise.config.ReadProperties.getWaitTimeOut;
import static com.automation.exercise.driver.DriverFactory.getDriver;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        driver = getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(getWaitTimeOut()));
        PageFactory.initElements(driver, this);
    }
    protected void click(WebElement button) {
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }
    protected void enterText(WebElement input, String text) {
        wait.until(ExpectedConditions.visibilityOf(input));
        input.sendKeys(text);
    }
    protected String getText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }
}

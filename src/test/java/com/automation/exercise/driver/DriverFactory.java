package com.automation.exercise.driver;

import com.automation.exercise.config.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private static WebDriver createDriver() {
        String browser = ReadProperties.getBrowserType();
        WebDriver webDriver;

        switch (browser.toLowerCase()) {
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
            }
            default -> {
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
            }

        }
        webDriver.manage().window().maximize();
        return webDriver;
    }

    public static void cleanupDriver() {
        if (driver.get() != null) {
           driver.get().quit();
           driver.remove();
        }
    }

    public static WebDriver getDriver() {
        if(driver.get() == null) {
            driver.set(createDriver());
        }
        return driver.get();
    }
}

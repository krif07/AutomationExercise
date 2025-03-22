package com.automation.exercise.driver;

import com.automation.exercise.utils.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private static WebDriver createDriver() {
        String browser = ReadProperties.getBrowserType();
        WebDriver webDriver;

        try{
            switch (browser.toLowerCase()) {
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions options = new FirefoxOptions();
                    options.addArguments("--headless");
                    webDriver = new FirefoxDriver(options);
                }
                case "edge" -> {
                    WebDriverManager.edgedriver().setup();
                    webDriver = new EdgeDriver();
                }
                case "chrome" -> {
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    //options.addArguments("--headless");
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    webDriver = new ChromeDriver(options);
                }
                default -> {
                    URL seleniumUrl = new URL("http://chrome:4444/wd/hub");
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    webDriver = new RemoteWebDriver(seleniumUrl,options);
                }

            }
            webDriver.manage().window().maximize();
            return webDriver;

        } catch (MalformedURLException e) {
            throw new RuntimeException("Error connecting to Selenium Grid: " + e.getMessage(), e);
        }

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

package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class TestWebElements {
    public void webElement() {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        By usernameField = By.id("user-name");
        By passwordField = By.id("password");
        By loginButton = By.id("login-button");

        //WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Explicit wait
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Fluent wait
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement username = driver.findElement(usernameField);
        username.sendKeys("standard_user");

        //Explicit wait second part
        //wait.until(ExpectedConditions.elementToBeClickable(passwordField)).sendKeys("secret_sauce");

        WebElement password = driver.findElement(passwordField);
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(loginButton);
        login.click();
    }
}

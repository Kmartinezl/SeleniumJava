package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.qa.way2automation.com");

        WebElement nameField = driver.findElement(By.cssSelector("input[name='name']"));
        WebElement phoneField = driver.findElement(By.cssSelector("input[name='phone']"));
        WebElement emailField = driver.findElement(By.cssSelector("input[name='email']"));
        WebElement countryDropdown = driver.findElement(By.cssSelector("select[name='country']"));
        WebElement cityField = driver.findElement(By.cssSelector("input[name='city']"));
        WebElement usernameField = driver.findElement(By.cssSelector("#load_box fieldset:nth-child(10) [type]"));
        WebElement passwordField = driver.findElement(By.cssSelector("#load_box [type='password']"));
        WebElement submitButton = driver.findElement(By.cssSelector("#load_box [value='Submit']"));


        nameField.sendKeys("Test");
        phoneField.sendKeys("123");
        emailField.sendKeys("test@test.com");
        Select select = new Select(countryDropdown);
        select.selectByValue("Malta");
        cityField.sendKeys("New york");
        usernameField.sendKeys("Assigment2");
        passwordField.sendKeys("assigment123");
        submitButton.click();

        /*Assigment2 assigment2 = new Assigment2();
        assigment2.enterName();
        assigment2.enterPhone();
        assigment2.enterEmail();
        assigment2.enterCountry();
        assigment2.enterCity();
        assigment2.enterUsername();
        assigment2.enterPassword();
        assigment2.clickSubmit();*/
    }
}

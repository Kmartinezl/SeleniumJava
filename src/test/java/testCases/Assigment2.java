package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment2 {

    WebDriver driver;
    WebElement nameField = driver.findElement(By.cssSelector("input[name='name']"));
    WebElement phoneField = driver.findElement(By.cssSelector("input[name='phone']"));
    WebElement emailField = driver.findElement(By.cssSelector("input[name='email']"));
    WebElement countryDropdown = driver.findElement(By.cssSelector("select[name='country']"));
    WebElement cityField = driver.findElement(By.cssSelector("input[name='city']"));
    WebElement usernameField = driver.findElement(By.cssSelector("#load_box fieldset:nth-child(10) [type]"));
    WebElement passwordField = driver.findElement(By.cssSelector("#load_box [type='password']"));
    WebElement submitButton = driver.findElement(By.cssSelector("#load_box [value='Submit']"));


    public Assigment2(){
        driver = new FirefoxDriver();
    }

    public void enterName(){
        nameField.sendKeys("Test");
    }

    public void enterPhone(){
        phoneField.sendKeys("123");
    }
    public void enterEmail(){
        emailField.sendKeys("test@test.com");
    }
    public void enterCountry(){

        Select select = new Select(countryDropdown);
        select.selectByValue("Malta");
    }

    public void enterCity(){
        cityField.sendKeys("New york");
    }
    public void enterUsername(){
        usernameField.sendKeys("Assigment2");
    }
    public void enterPassword(){
        passwordField.sendKeys("assigment123");
    }
    public void clickSubmit(){
        submitButton.click();
    }
}

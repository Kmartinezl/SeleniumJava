package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Assigment1 {
    public void assigment1(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.way2automation.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links are: " + links.size());

        for(WebElement link: links){
            System.out.println(link.getText()+ "--- URL IS ---" + link.getAttribute("href"));
        }

    }
}

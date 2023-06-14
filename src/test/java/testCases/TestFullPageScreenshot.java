package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;



import java.io.File;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestFullPageScreenshot {
   /* public static void main (String [] args) throws IOException{
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.qa.way2automation.com");

        //Screenshot visible area
        File pageScreenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(pageScreenshot, new File("./screenshot/page.jpg"));

        //Screenshot full page
        File fullPage = driver.getFullPageScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fullPage, new File("./screenshot/fullpage.jpg"));
    }*/
}

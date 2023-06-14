package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestIsElementPresent {
    public static WebDriver driver = new FirefoxDriver();
    /*public static void main(String [] args){


        driver.get("https://www.wikipedia.org");

        //System.out.println(isElementPresent(By.xpath("//*[@id=\"searchInput\"]")));
        System.out.println(isElementPresent(By.id("searchLanguage234")));

    }*/

    public static boolean isElementPresent(By by){
        try {
            driver.findElement(by);
            return true;
        }
        catch(Throwable t){
            return false;
        }
    }
}

package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TestDoubleCalendar {
    public static void main(String [] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.expedia.ca/");

        driver.findElement(By.xpath("//button[@id='d1-btn']")).click();

        String month = "December 2023";
        String expDate = "15";


        while (true){

            String text = driver.findElement(By.xpath("//div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).getText();

            if (text.equals(month)){
                break;
            }
            else {
                driver.findElement(By.cssSelector(".uitk-layout-flex-justify-content-space-between .uitk-button-paging:nth-of-type(2)")).click();
            }
        }
        List <WebElement> allDates = driver.findElements(By.xpath("//div[1]/table[1]/tbody[1]/tr/td/button[1]"));

        for (WebElement ele: allDates){

            String dateText = ele.getText();
            String [] date = dateText.split("\n");

            if (date[1].equals(expDate)){
                ele.click();
                break;
            }
        }

    }
}

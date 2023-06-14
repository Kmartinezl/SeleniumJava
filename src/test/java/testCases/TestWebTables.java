package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TestWebTables {
    public void webTables(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");

        List<WebElement> rowNum =  driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        System.out.println("Total rows are: "+ rowNum.size());

        List<WebElement> colNum =  driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
        System.out.println("Total cols are: "+ colNum.size());

        for (int rows = 1; rows <= rowNum.size(); rows++){
            for (int cols = 1; cols <= colNum.size(); cols++){
                System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+cols+"]")).getText()+"        ");
            }
            System.out.println();
        }
    }
}

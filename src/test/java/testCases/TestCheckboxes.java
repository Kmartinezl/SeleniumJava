package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TestCheckboxes {
    public static WebDriver driver = new FirefoxDriver();
    public void checkboxes(){

        //WebDriver driver = new FirefoxDriver();
        driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");

        /*driver.findElement(By.xpath("//div[4]/input[1]")).click();
        driver.findElement(By.xpath("//div[4]/input[2]")).click();
        driver.findElement(By.xpath("//div[4]/input[3]")).click();
        driver.findElement(By.xpath("//div[4]/input[4]")).click();    */

        /*for (int i = 1; i <= 4; i++){

            driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
        }  */

        //Noun of checkboxes are dinamic
       /* int i = 1;
        int count = 0;
        while (isElementPresent(By.xpath("//div[4]/input[" + i + "]"))) {

            driver.findElement(By.xpath("//div[4]/input[" + i + "]")).click();
            i++;
            count++;
        }
        System.out.println("Total checkboxes are: "+count);
    }

    public static boolean isElementPresent(By by){
         try {
             driver.findElement(by);
             return true;
         }
         catch (Throwable t){
             return false;
         }    */

        WebElement block = driver.findElement(By.xpath("//div[4]"));
        List<WebElement> checkboxes = block.findElements(By.name("sports"));
        System.out.println("Total checkboxes are " + checkboxes.size());

        for(WebElement checkbox: checkboxes){
            checkbox.click();
        }
    }
}

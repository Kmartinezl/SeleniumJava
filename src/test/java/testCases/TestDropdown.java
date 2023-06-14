package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestDropdown {
    public void dropdown(){

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.findElement(By.name("country")).sendKeys("Germany");
        WebElement dropdown = driver.findElement(By.name("country"));
        Select select = new Select(dropdown);

        //select.selectByVisibleText("Germany");
        select.selectByValue("Angola");

        List<WebElement> values = driver.findElements(By.tagName("option"));
        System.out.println("Total values are: " + values.size());
        System.out.println(values.get(7).getText());

        for(int i = 0; i<values.size(); i++){

            System.out.println(values.get(i).getText());
            System.out.println(values.get(i).getAttribute("value"));
        }
    }

    //public static class TestScreenshot {

    public static void main (String [] args) throws IOException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.qa.way2automation.com");

        WebElement above = driver.findElement(with(By.tagName("input")).above(By.tagName("select")));
        above.sendKeys("trainer@way2automation.com");
        File aboveScrn = above.getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(aboveScrn, new File("./screenshot/above.jpg"));

    }
}

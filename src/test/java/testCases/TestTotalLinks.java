package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class TestTotalLinks {
    public void totalLinks(){

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.wikipedia.org");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[7]/div[3]"));

        List<WebElement> links = block.findElements(By.tagName("a"));
        //List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links are: " + links.size());

        //Print all Wikipedia's links
        for (WebElement link: links){
            System.out.println(link.getText()+" --- URL IS ---"+link.getAttribute("href"));
        }
    }
}

package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestMultipleElemRelativeLocator {
    public void multipleElement(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> labels = driver.findElements(with(By.tagName("label")).below(By.cssSelector("#load_box h3")));

        for(WebElement label: labels){
            System.out.println(label.getText());
        }
    }
}

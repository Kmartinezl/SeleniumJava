package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestRelativeLocators {
    public void relativeLocators() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement above = driver.findElement(with(By.tagName("input")).above(By.tagName("select")));
        above.sendKeys("trainer@way2automation.com");

        WebElement below = driver.findElement(with(By.tagName("input")).below(By.tagName("select")));
        below.sendKeys("New Delhi");

        WebElement rightOf = driver.findElement(with(By.cssSelector("#load_box [type='password']")).toRightOf(By.tagName("label")));
        rightOf.sendKeys("asnjdñasklasl");

        WebElement leftOf = driver.findElement(with(By.linkText("Signin")).toLeftOf(By.cssSelector("#load_box [value='Submit']")));
        leftOf.click();

        WebElement near = driver.findElement(with(By.partialLinkText("THE")).near(By.linkText("Signin")));
        near.click();

        //Combining locators
        driver.findElement(with(By.tagName("input"))
                        .above(By.linkText("Signin"))
                        .below(By.cssSelector("#load_box fieldset:nth-child(10) [type]")))
                .sendKeys("ahsbjabdsjlns");
    }
}

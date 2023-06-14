package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBrowsers {
    public void testBrowser() {

        //System.setProperty("webdriver.gecko.driver", "C:\Users\User\Documents\Selenium Training\Drivers\geckodriver-v0.32.2-win-aarch64\geckodriver.exe");
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");
        //FirefoxDriver = new FirefoxDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        //ChromeDriver driver = new ChromeDriver();
        //  WebDriver driver = new FirefoxDriver();
        driver.get("http://way2automation.com");

        String title = driver.getTitle();
        System.out.println(title.length());
        System.out.println(title);

        driver.close();
        //driver.quit(); Entire session closed


    }
}

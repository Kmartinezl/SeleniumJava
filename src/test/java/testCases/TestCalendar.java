package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
   /* public static void main (String [] args) throws InterruptedException, ParseException {

       // WebDriver driver = new FirefoxDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.goibibo.com/");

        driver.findElement(By.cssSelector("div:nth-of-type(3) > .dwhdnN.fswFld.sc-12foipm-16")).click();
        Thread.sleep(3000);

        String d = "31/03/2021"; //dd/mm/yyyy format
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};

        //extract day, month, year
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date mydate = df.parse(d);

        //Create a calendar instance
        java.util.Calendar cal = java.util.Calendar.getInstance();

        //Set day in calendar
        cal.setTime(mydate);


        //Getting day, month and year
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        System.out.println(day);
       // System.out.println(month);
        System.out.println(months[month]);
        System.out.println(year);

        String forwardArrow = ".DayPicker-NavButton--next";
        String travelMonth = months[month] + " " + year;
        System.out.println(travelMonth);
        String monthYearSection = "div:nth-of-type(1) > div[role='heading'] > div";

        while (!driver.findElement(By.cssSelector(monthYearSection)).getText().equals(travelMonth)){
            driver.findElement(By.cssSelector(forwardArrow)).click();
        }

        //Select desired day
        driver.findElement(By.xpath("//div[text()='" + day + "']")).click();

    }*/
}

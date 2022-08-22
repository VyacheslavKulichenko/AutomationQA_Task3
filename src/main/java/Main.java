import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Get the current window handle and open a new tab using Ctrl + t
        driver.get("http://google.com");
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

        // The size of the output of getWindowHandles() is 1 which means that there is one single window handle
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window(tabs.get(0).toString());

        //The control is now in the new tab
        driver.get("http://bing.com");
        //perform other operations.






    }

}


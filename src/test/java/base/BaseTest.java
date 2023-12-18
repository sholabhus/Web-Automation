package base;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowsManager;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();

    }

    @BeforeMethod
    public void goHome() {
        try {
            driver.get("https://the-internet.herokuapp.com/ ");
            homePage = new HomePage(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // @AfterClass
    //public void tearDown(){
    // driver.quit();
    //  }
    public WindowsManager getWindowsManager() {
        return new WindowsManager(driver);
    }


    //@AfterMethod
    // public void takeScreenshot() {
    //var camera = (TakesScreenshot) driver;
    // File screenshot = camera.getScreenshotAs(OutputType.FILE);
    //try {
    //   Files.move(screenshot, new File("resources/screenshots/test.png"));
    // } catch (IOException e) {
    //     e.printStackTrace();
    //  }
    // }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/test.png" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}







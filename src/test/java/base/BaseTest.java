package base;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowsManager;

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
    }







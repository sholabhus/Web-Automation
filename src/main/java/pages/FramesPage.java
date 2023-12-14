package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By NestedFrames = By.xpath("//*[@id=\'content\']/div/ul/li[1]/a");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFrames(){
        driver.findElement(NestedFrames).click();
        return new NestedFramesPage(driver);
    }

}

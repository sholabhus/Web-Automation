package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {
    private WebDriver driver;
    private By startButton =By.cssSelector("#start button");
    private By loadedText= By.id("finish");


    public DynamicLoadingExample2Page(WebDriver driver){
      this.driver =driver;

    }

    public void clickStart(){
        driver.findElement(startButton).click();
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait =new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));


    }

    public boolean isStartButtonDisplayed(){
        return driver.findElement(startButton).isDisplayed();
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }

}


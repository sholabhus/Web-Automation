package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StandardCodePage {

    private WebDriver driver;

    public By result = By.className("example");

    public StandardCodePage(WebDriver driver){
        this.driver =driver;

    }
    public String getResult(){
        return driver.findElement(result).getText();
    }
}


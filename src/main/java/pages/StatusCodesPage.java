package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodesPage {
    private WebDriver driver;

    private By StatusStandard = By.linkText("200");


    public StatusCodesPage(WebDriver driver) {

        this.driver = driver;
    }
 public StandardCodePage clickStandard200(){
     driver.findElement(StatusStandard).click();
     return new StandardCodePage(driver);
        }




}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeolocationPage {

    private WebDriver driver;
    private By WhereAmIButton = By.xpath("//*[@id=\'content\']/div/button");

    public By textResult=By.className("example");

    public GeolocationPage(WebDriver driver){
        this.driver = driver;

    }

   public  void clickWhereButton(){
       driver.findElement(WhereAmIButton).click();
    }


    public String getResult(){
        return driver.findElement(textResult).getText();
    }




}

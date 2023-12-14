package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
   private String username = "admin";
    //String Password ="admin";
    private By UserName = By.xpath("//label[text()='Username']");
    ;

    public  SignInPage (WebDriver driver){
        this.driver =driver;



       // public String enterUser() {
        //    driver.findElement(UserName).sendKeys(username);


     //   }


    }
}

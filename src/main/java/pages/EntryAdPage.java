package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver;

    private By ModalClose = By.xpath("//*[@id=\'modal\']/div[2]/div[3]/p");



    public EntryAdPage(WebDriver driver)
    {
        this.driver =driver;
    }

    public void clickModalClose(){
        driver.findElement(ModalClose).click();

    }



}

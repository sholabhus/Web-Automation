package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By Hovers = By.linkText("Hovers");

    private By KeyPresses = By.linkText("Key Presses");

    private By HorizontalSlides = By.linkText("Horizontal Slider");

    private By JavaScript = By.xpath("/html/body/div[2]/div/ul/li[29]/a");


    private By FileUpload = By.linkText("File Upload");

    private By EntryAd = By.xpath("//*[@id=\"content\"]/ul/li[15]/a");

    private By ContextMenu = By.xpath("//*[@id='content']/ul/li[7]/a");

    private By WysiwygEditor = By.xpath("//*[@id='content']/ul/li[44]/a");


    private By Frames = By.xpath("//*[@id=\'content\']/ul/li[22]/a");

    private By DynamicallyLoad = By.xpath("//*[@id='content']/ul/li[14]/a");

    private By BasicAuth = By.xpath("//*[@id=\'content\']/ul/li[3]/a");


    private By MultipleWindows = By.xpath("//*[@id='content']/ul/li[33]/a");


    private By DynamicLoading =By.xpath("//*[@id='content']/ul/li[14]/a");
    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public HoversPage clickHovers() {
        driver.findElement(Hovers).click();
        //clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPress() {
        driver.findElement(KeyPresses).click();
        // clickLink("key_presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider() {
        driver.findElement(HorizontalSlides).click();
        return new HorizontalSliderPage(driver);
    }

    public AlertPage clickJavaScriptAlerts() {
        driver.findElement(JavaScript).click();
        return new AlertPage(driver);
    }

    public FileUploadPage clickFileUpload() {
        driver.findElement(FileUpload).click();
        return new FileUploadPage(driver);
    }

    public EntryAdPage clickEntryAd() {
        driver.findElement(EntryAd).click();
        return new EntryAdPage(driver);
    }

    public ContextMenuPage clickContextMenu() {
        driver.findElement(ContextMenu).click();
        return new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickWysiwyg() {
        driver.findElement(WysiwygEditor).click();
        return new WysiwygEditorPage(driver);

    }

    public FramesPage clickFrames() {
        driver.findElement(Frames).click();
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        driver.findElement(DynamicallyLoad).click();
        return new DynamicLoadingPage(driver);

    }

    public SignInPage clickBasicAuth(){
        driver.findElement(BasicAuth).click();
        return new SignInPage(driver);

    }

    public MultipleWindowsPage clickMultipleWindowsLink(){
        driver.findElement(MultipleWindows).click();
        return new MultipleWindowsPage(driver);
    }

   public DynamicLoadedPage clickDynamicLoaded(){
        driver.findElement(DynamicLoading).click();
        return new DynamicLoadedPage(driver);
   }
}


































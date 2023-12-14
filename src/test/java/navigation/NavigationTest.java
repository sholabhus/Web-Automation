package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowsManager().goBack();
        getWindowsManager().goForward();
        getWindowsManager().refreshPage();
        getWindowsManager().goTo("https://google.com");
    }

    @Test
    public void  testSwitchTab(){
        homePage.clickMultipleWindowsLink().clickHere();
        getWindowsManager().switchToTab("New Window");
    }
}

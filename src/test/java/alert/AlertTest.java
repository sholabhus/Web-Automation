package alert;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert","Result text passed");
}

@Test
    public void textGetTextFromAlert()
{
    var alertsPage = homePage.clickJavaScriptAlerts();
    alertsPage.triggerConfirm();
    String text= alertsPage.alert_getText();
    alertsPage.alert_clickToDismiss();
    assertEquals(text, "I am a JS Confirm","Alert text is correct");

}

@Test
public void testSetInputInAlert(){
var alertsPage=homePage.clickJavaScriptAlerts();
alertsPage.triggerPrompt();
String text="rocks!";
alertsPage.alert_setInput(text);

alertsPage.alert_clickToAccept();
assertEquals(alertsPage.getResult(),"You entered: "  +  text, "Result");

}
}
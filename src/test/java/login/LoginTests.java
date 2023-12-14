package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static com.sun.org.apache.xpath.internal.compiler.Token.contains;
import static jdk.internal.org.jline.utils.Colors.s;
import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertTrue;


public class LoginTests extends BaseTest {

            @Test
            public void testSuccessfulLogin() {
                LoginPage loginPage = homePage.clickFormAuthentication();
                loginPage.setUsername("tomsmith");
                loginPage.setPassword("SuperSecretPassword!");
                SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
                String expectedAlertText = "You logged into a secure area";
               assertTrue("Alert text is incorrect", secureAreaPage.getAlertText().contains(expectedAlertText));
            }
        }





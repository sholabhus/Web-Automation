package statuscode;


import base.BaseTest;
import org.testng.annotations.Test;
import pages.StandardCodePage;
import pages.StatusCodesPage;

import static org.testng.Assert.assertEquals;

public class StatusCodeTest extends BaseTest {


   @Test
    public void testStatusCodePage(){
       var statusCodePage =homePage.clickStatusCodes().clickStandard200();
       assertEquals(statusCodePage.getResult(),("Status Codes\n" + "This page returned a 200 status code.\n\n" + "For a definition and common list of HTTP status codes, go here"));
      System.out.println(statusCodePage.getResult());


    }
}

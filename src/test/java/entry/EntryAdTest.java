package entry;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;

import static java.awt.SystemColor.text;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EntryAdTest extends BaseTest {

    @Test
    public void testCloseModal(){
        var entry = homePage.clickEntryAd();
     entry.clickModalClose();
       // assertEquals(text, "Modal is still displayed after clicking close");
    }
}

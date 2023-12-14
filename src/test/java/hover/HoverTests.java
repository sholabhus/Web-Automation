package hover;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTest {

    private WebElement webElement;

    @Test
    public void testHoverUser1() {
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);


        assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        assertEquals(caption.getTitle(),"name:user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(),"View profile", "Caption link text");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");

        }
        }



package contextmenu;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testRightClick(){
        var menuPage =homePage.clickContextMenu();
        menuPage.rightClickInBox();
        String message =menuPage.getPopUpText();
        menuPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "popup message incorrect");
    }
}

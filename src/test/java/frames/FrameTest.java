package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTest {
@Test
    public void testWysiwyg(){
    var editorPage =homePage.clickWysiwyg();
    editorPage.clearTextArea();
    String text1 ="hello";
    String text2 ="worrld";
    editorPage.setTextArea(text1);
    editorPage.decreaseIndention();
    editorPage.setTextArea(text2);
    assertEquals(editorPage.getTextFromEditor(),text1 + text2, "The text");
}
}



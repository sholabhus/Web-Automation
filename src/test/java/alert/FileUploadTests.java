package alert;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload(){

        var uploadPage= homePage.clickFileUpload();
        uploadPage.uploadFile("C:/Users/shola/IdeaProjects/Web Automation/resources/chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe", "Uploaded");
    }


}

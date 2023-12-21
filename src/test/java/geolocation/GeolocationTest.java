package geolocation;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GeolocationTest extends BaseTest {

    @Test

    public void testGeolocation(){
        var geolocationPage =homePage.clickGeolocationLink();
        geolocationPage.clickWhereButton();
        assertEquals(geolocationPage.getResult(),("Geolocation\n" + "Click the button to get your current latitude and longitude\n" +
                "Where am I?"));
        System.out.println(geolocationPage.getResult());



    }

}

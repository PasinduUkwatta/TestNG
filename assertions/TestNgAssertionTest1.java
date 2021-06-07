package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssertionTest1 {
    @Test
    public void testAssertEquals(){
        String actualValue ="University of Moratuwa";
        Assert.assertEquals(actualValue,"University of Moratuwa","XXXX YYYY");
    }

    @Test
    public void testAssertNotEquals(){
        String actualValue ="University of Moratuwa";
        Assert.assertNotEquals(actualValue,"University of Moratuwa","Not Equals");
    }

    @Test
    public void testAssertTrue(){
       boolean actualResult = false;
       Assert.assertTrue(actualResult,"Failed : Boolean Mismatch");
    }

    @Test
    public void testAssertFalse(){
        boolean actualResult = false;
        Assert.assertFalse(actualResult,"Failed : Boolean Mismatch");
    }
}

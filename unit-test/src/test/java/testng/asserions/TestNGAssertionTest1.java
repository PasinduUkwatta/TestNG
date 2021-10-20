package testng.asserions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionTest1 {
//    @Test
//    public void testAssertEquals(){
//        String actualValue="University of Moratuwa";
//        Assert.assertEquals(actualValue,"University Of Moratuwa","Failed Sting not matched");
//    }

    @Test
    public void testAssertTrue(){
        boolean actualResult=false;
        Assert.assertTrue(actualResult,"Failed:Boolean mismatch");

    }
}

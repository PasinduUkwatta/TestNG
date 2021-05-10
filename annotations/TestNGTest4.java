package testng.annotations;

import org.testng.annotations.*;

public class TestNGTest4 {
    @Test
    public void test1() {
        System.out.println("Test 1!!");
    }

    @Test
    public void test2() {
        System.out.println("Test 2!!");
    }


    @BeforeMethod
    //PRE CONDITIONS
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    //POST CONDITIONS
    public void afterMethod() {
        System.out.println("After Method");
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("After Class");
    }


}

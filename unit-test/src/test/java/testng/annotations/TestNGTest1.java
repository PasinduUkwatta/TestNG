package testng.annotations;

import org.testng.annotations.*;

public class TestNGTest1 {
    public static void main(String[] args){
        System.out.println("Hello TestNG !");
    }



    @BeforeMethod(groups = {"smoke"})
    private void beforeMethod3(){

        System.out.println("Before3");
    }

    @BeforeMethod(groups = {"smoke"})
    private void beforeMethod2(){

        System.out.println("Before2");
    }

    @AfterMethod(groups = {"reg"})
    private void afterMethod3(){

        System.out.println("After3");
    }
    @AfterMethod(groups = {"reg"})
    private void afterMethod2(){

        System.out.println("After2");
    }

    @AfterClass
    private void afterClass(){
        System.out.println("After CLass");
    }

    @BeforeClass(groups = {"reg"})
    private void beforeClass(){

        System.out.println("Before Class");
    }
    @Test(groups ={"smoke","reg"},priority = 1)
    private void test1(){
        System.out.println("Test1");
    }

    @Test(groups = {"smoke"},priority = 1)
    private void test2(){

        System.out.println("Test2");
    }

}

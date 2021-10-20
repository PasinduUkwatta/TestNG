package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest2 {
    public static void main(String[] args){
        System.out.println("Hello TestNG !");
    }

    @AfterMethod(groups = {"reg"})
    private void afterMethod(){
        System.out.println("After");
    }

    @Test(groups ={"smoke","reg"})
    private void test1(){
        System.out.println("Test");
    }

    @Test(groups = {"smoke"},priority = 0)
    private void test2(){
        System.out.println("Test2");
    }

    @BeforeMethod(groups = {"smoke"})
    private void beforeMethod(){
        System.out.println("Before");
    }

    @BeforeClass(groups = {"reg"})
    private void beforeClass(){
        System.out.println("Before Class");
    }
}

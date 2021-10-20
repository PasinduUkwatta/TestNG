package testng;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest {
    ArithmeticOperator calc;
    @BeforeMethod
    public void setUp(){
        calc= new ArithmeticOperator();
    }

    @Test(dataProvider="getData")
//    @Test
    public void testSum(int a,int b, int expected,String message){
//        Assert.assertEquals(calc.sum(100,200),300,"Failed to pass test case");
        Assert.assertEquals(calc.sum(a,b),expected,message);
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {100,200,300,"Failed to pass test case"},
                {-1,-1,-2,"Failed to pass test case"},
                {0,1,2,"Failed to pass test case"},
                {-1,-1,-2,"Failed to pass test case"},
        };
    }
}

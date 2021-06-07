package SimpleCalculator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//class name -->xyz
//test class name -->xyxTest

//method name -->abc()
//test method name -->testABC()
public class ArithmeticOperatorTest {

    ArithmeticOperator calc;

    @BeforeClass
    public void setUp() {
        calc = new ArithmeticOperator();

    }

    @Test(dataProvider ="getData")
    public void testSum(int input1,int input2,int expected,String message) {
        Assert.assertEquals(calc.sum(input1,input2),expected,message);


    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {100,200,300,"Failed to Calculate sum"},
                {-100,-200,-300,"Failed to Calculate sum"},
                {-1,1,0,"Failed to Calculate sum"},
                {0,-1,-1,"Failed to Calculate sum"}
        };
    }
}

package be.intecbrussel.MathExpressionEvaluator;

import be.intecbrussel.MathExpressionEvaluator.service.BasicMathService;
import be.intecbrussel.MathExpressionEvaluator.service.basicMathServiceImpl;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)


public class BasicMathServiceTest {
    private BasicMathService basicMathService ;

    @BeforeAll
    public void beforeAll() {
        //TODO instance the service
        basicMathService = new basicMathServiceImpl();
    }

    @Test

    public void testBasicAdditionalOfTowIntegers(){

        int firstNumber = 7 ;
        int secondNumber = 6 ;

        int expectedValue = 14 ;

        double result = basicMathService.add(firstNumber,secondNumber);

        Assertions.assertEquals(expectedValue , result);

    }


}

package be.intecbrussel.MathExpressionEvaluator;

import be.intecbrussel.MathExpressionEvaluator.service.BasicMathService;
import be.intecbrussel.MathExpressionEvaluator.service.basicMathServiceImpl;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)


    public class BasicMathServiceTest {
    private BasicMathService basicMathService;

    @BeforeAll
    public void beforeAll() {
        //TODO instance the service
        basicMathService = new basicMathServiceImpl();
    }

    @Test
    public void testBasicAdditionalOfTowIntegers() {

        int firstNumber = 7;
        int secondNumber = 6;

        int expectedValue = 13;

        double result = basicMathService.add(firstNumber, secondNumber);

        assertEquals(expectedValue, result);
    }

    @Test
    public void testBasicAdditionOfTwoNegativeNumbers() {
        int firstNumber = -7;
        int secondNumber = -6;

        int expectedResult = -13;

        double result = basicMathService.add(firstNumber, secondNumber);

        Assertions.assertEquals(expectedResult, result);
    }

    // @ValueSource
    @ParameterizedTest
    @MethodSource("basicAdditionFactory")
    public void testBasicAdditions(double firstNumber, double secondNumber, double expectedResult) {
        double result = basicMathService.add(firstNumber, secondNumber);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> basicAdditionFactory() {
        return Stream.of(
                Arguments.of(5, 3, 8),
                Arguments.of(50, 3, 53),
                Arguments.of(-5, 3, -2),
                Arguments.of(0, 0, 0),
                Arguments.of(-7, -3, -10),
                Arguments.of(5, -3, 2),
                Arguments.of(5.5, 4.5, 10),
                Arguments.of(2000000000, 2000000000, 4000000000L),
                Arguments.of(-0.00001, 0.00002, 0.00001),
                //Arguments.of(-0.000_01 , 0.000_02 , 0.000_01),
                Arguments.of(5.5, 4.5, 10)
        );

    }

    @ParameterizedTest
    @MethodSource("basicSubFactory")
    public void testBasicOfTowNumbersSubtract(double firstNumber, double secondNumber, double expectedResult) {


        double result = basicMathService.subtract(firstNumber, secondNumber);
        Assertions.assertEquals(expectedResult, result);


    }

    public static Stream<Arguments> basicSubFactory() {
        return Stream.of(
                Arguments.of(5, 3, 2),
                Arguments.of(50, 3, 47),
                Arguments.of(-5, 3, -8),
                Arguments.of(0, 0, 0),
                Arguments.of(-7, -3, -4),
                Arguments.of(5, -3, 8),
                Arguments.of(4.5, 5.4, -0.9),
                //Arguments.of(2000000000 , 4000000000L , - 2000000000),
                Arguments.of(-0.00001, -0.00002, 1E-5),
                //Arguments.of(-0.00001 , 0.00002 , 0.000_01),
                Arguments.of(5.5, 4.5, 1)
        );
    }
    @ParameterizedTest
    @MethodSource("basicMultiFactory")
    public void testBasicOfTowNumbersMulti(double firstNumber, double secondNumber, double expectedResult)
    {
        double result = basicMathService.multiply(firstNumber, secondNumber);
        Assertions.assertEquals(expectedResult, result);
    }
    public static Stream<Arguments> basicMultiFactory() {
        return Stream.of(
                Arguments.of(5, 3, 15.0),
                Arguments.of(50, 3, 150),
                Arguments.of(-5, 3, -15),
                Arguments.of(0, 0, 0),
                Arguments.of(-7, -3, 21),
                Arguments.of(5, -3, -15),
                Arguments.of(4.5, 5.4,24.3 ),
                //Arguments.of(2000000000 , 4000000000L , - 2000000000),
                Arguments.of(-0.00001, -0.00002, 2.0000000000000003E-10),
                //Arguments.of(-0.000_01 , 0.000_02 , 0.000_01),
                Arguments.of(5.5, 4.5, 24.75)
        );

    }
    @ParameterizedTest
    @MethodSource("basicDivideFactory")
    public void testBasicOfTowNumbersDivide(double firstNumber, double secondNumber, double expectedResult)
    {
        double result = basicMathService.divide(firstNumber, secondNumber);
        Assertions.assertEquals(expectedResult, result);
    }
    public static Stream<Arguments> basicDivideFactory() {
        return Stream.of(
                Arguments.of(5, 3, 1.6666666666666667),
                Arguments.of(50, 3, 16.666666666666668),
                Arguments.of(-5, 3, -1.6666666666666667),
         //       Arguments.of(0, 0, 0),
                Arguments.of(-7, -3, 2.3333333333333335),
                Arguments.of(5, -3, -1.6666666666666667),
                Arguments.of(4.5, 5.4, 0.8333333333333333),
                //Arguments.of(2000000000 , 4000000000L , - 2000000000),
                Arguments.of(-0.00001, -0.00002, 0.5),
                //Arguments.of(-0.000_01 , 0.000_02 , 0.000_01),
                Arguments.of(5.5, 4.5, 1.2222222222222223)
        );


    }

    @ParameterizedTest
    @MethodSource("basicModulusFactory")
    public void testBasicOfTowNumbersModulus(double firstNumber, double secondNumber, double expectedResult)
    {
        double result = basicMathService.modulus(firstNumber, secondNumber);
        Assertions.assertEquals(expectedResult, result);
    }
    public static Stream<Arguments> basicModulusFactory() {
        return Stream.of(
                Arguments.of(5, 3, 2.0),
                Arguments.of(50, 3, 2),
                Arguments.of(-5, 3, -2),
                //       Arguments.of(0, 0, 0),
                Arguments.of(-7, -3, -1.0),
                Arguments.of(5, -3, 2),
                Arguments.of(4.5, 5.4, 4.5),
                //Arguments.of(2000000000 , 4000000000L , - 2000000000),
                Arguments.of(-0.00001, -0.00002 ,-1.0E-5),
                //Arguments.of(-0.000_01 , 0.000_02 , 0.000_01),
                Arguments.of(5.5, 4.5, 1)
        );


    }
}


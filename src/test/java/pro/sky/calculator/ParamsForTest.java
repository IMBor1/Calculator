package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParamsForTest {
    CalculatorServiceImpl calc = new CalculatorServiceImpl();

    public static Stream<Arguments> paramsForSumTest() {
        return Stream.of(Arguments.of(5, 5, "5 + 5 = 10"),
                Arguments.of(5, 2, "5 + 2 = 7"));
    }

    @ParameterizedTest
    @MethodSource("paramsForSumTest")
    public void correctSumTest(int a, int b, String result) {
        assertEquals(calc.sumCalculator(a, b), result);
    }

    public static Stream<Arguments> paramsForMinusTest() {
        return Stream.of(Arguments.of(5, 5, "5 - 5 = 0"),
                Arguments.of(5, 2, "5 - 2 = 3"));
    }

    @ParameterizedTest
    @MethodSource("paramsForMinusTest")
    public void correctMinusTest(int a, int b, String result) {
        assertEquals(calc.minusCalculator(a, b), result);
    }

    public static Stream<Arguments> paramsForMultiplyTest() {
        return Stream.of(Arguments.of(5, 5, "5 * 5 = 25"),
                Arguments.of(5, 2, "5 * 2 = 10"));
    }

    @ParameterizedTest
    @MethodSource("paramsForMultiplyTest")
    public void correctMultiplyTest(int a, int b, String result) {
        assertEquals(calc.multiplyCalculator(a, b), result);
    }

    public static Stream<Arguments> paramsForDivideTest() {
        return Stream.of(Arguments.of(5, 5, "5 / 5 = 1"),
                Arguments.of(5, 1, "5 / 1 = 5"));
    }

    @ParameterizedTest
    @MethodSource("paramsForDivideTest")
    public void correctDevideTest(int a, int b, String result) {
        assertEquals(calc.divideCalculator(a, b), result);
    }
}

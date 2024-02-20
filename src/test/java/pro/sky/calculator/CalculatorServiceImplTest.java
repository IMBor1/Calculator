package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {
    CalculatorServiceImpl calc = new CalculatorServiceImpl();

    @Test
    public void AnswerHello() {
        String result = calc.answerHelloCalculator();
        Assertions.assertEquals("Добро пожаловать в калькулятор", result);
    }

    @Test
    public void sum5Plus5Return10() {

        String result = calc.sumCalculator(5, 5);
        Assertions.assertEquals("5 + 5 = " + 10, result);
    }

    @Test
    public void sum2Plus5Return7() {

        String result = calc.sumCalculator(2, 5);
        Assertions.assertEquals("2 + 5 = " + 7, result);
    }

    @Test
    public void minus5_5Return0() {
        String result = calc.minusCalculator(5, 5);
        Assertions.assertEquals("5 - 5 = " + 0, result);
    }

    @Test
    public void minus5_2Return3() {
        String result = calc.minusCalculator(5, 2);
        Assertions.assertEquals("5 - 2 = " + 3, result);
    }

    @Test
    public void multyply5_5Return25() {
        String result = calc.multiplyCalculator(5, 5);
        Assertions.assertEquals("5 * 5 = " + 25, result);
    }

    @Test
    public void multyply5_2Return25() {
        String result = calc.multiplyCalculator(5, 2);
        Assertions.assertEquals("5 * 2 = " + 10, result);
    }

    @Test
    public void divide5_5Return1() {
        String result = calc.divideCalculator(5, 5);
        Assertions.assertEquals("5 / 5 = " + 1, result);
    }

    @Test
    public void divide5_0ReturnIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.divideCalculator(5, 0));
    }
}

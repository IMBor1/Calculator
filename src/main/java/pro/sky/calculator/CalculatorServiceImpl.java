package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String answerHelloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String sumCalculator(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minusCalculator(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiplyCalculator(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divideCalculator(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();

        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }


}

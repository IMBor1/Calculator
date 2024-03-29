package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

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
        if (num1 == 0 || num2 == 0) {
            return "На ноль делить нельзя";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }


}

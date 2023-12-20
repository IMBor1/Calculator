package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceimpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceimpl) {
        this.calculatorServiceimpl = calculatorServiceimpl;
    }

    @GetMapping
    public String helloCalculator() {
        return calculatorServiceimpl.helloCalculator();
    }

    @RequestMapping(path = "/calculator")
    public String answerHelloCalculator() {
        return calculatorServiceimpl.answerHelloCalculator();
    }

    @RequestMapping(path = "/calculator/plus")
    public String sumCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceimpl.sumCalculator(num1, num2);
    }

    @RequestMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceimpl.minusCalculator(num1, num2);
    }

    @RequestMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceimpl.multiplyCalculator(num1, num2);
    }

    @RequestMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceimpl.divideCalculator(num1, num2);
    }
}

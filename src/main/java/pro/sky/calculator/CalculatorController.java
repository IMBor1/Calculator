package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/calculator")
@RestController
public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceimpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceimpl) {
        this.calculatorServiceimpl = calculatorServiceimpl;
    }


    @GetMapping
    public String answerHelloCalculator() {
        return calculatorServiceimpl.answerHelloCalculator();
    }

    @RequestMapping(path = "/plus")
    public String sumCalculator(@RequestParam(value = "num1", required = false) int num1,
                                @RequestParam(value = "num2", required = false) int num2) {
        return calculatorServiceimpl.sumCalculator(num1, num2);
    }

    @RequestMapping(path = "/minus")
    public String minusCalculator(@RequestParam(value = "num1", required = false) int num1,
                                  @RequestParam(value = "num2", required = false) int num2) {
        return calculatorServiceimpl.minusCalculator(num1, num2);
    }

    @RequestMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam(value = "num1", required = false) int num1,
                                     @RequestParam(value = "num2", required = false) int num2) {
        return calculatorServiceimpl.multiplyCalculator(num1, num2);
    }

    @RequestMapping(path = "/divide")
    public String divideCalculator(@RequestParam(value = "num1", required = false) int num1,
                                   @RequestParam(value = "num2", required = false) int num2) {
        return calculatorServiceimpl.divideCalculator(num1, num2);
    }
}

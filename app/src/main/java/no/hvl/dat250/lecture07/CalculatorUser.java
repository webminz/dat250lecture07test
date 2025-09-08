package no.hvl.dat250.lecture07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // A component is like a bean-method in a config only that the class will implicitly instantiated
public class CalculatorUser {

    private final CalculationInterface calculator;

    public CalculatorUser(@Autowired CalculationInterface calculator) {
        this.calculator = calculator;
    }

    public void doUseIt() {
        double a = 5.0;
        double b = 3.0;
        double result = this.calculator.calculate(a, b);
        System.out.println("Result is " + result);
    }


}

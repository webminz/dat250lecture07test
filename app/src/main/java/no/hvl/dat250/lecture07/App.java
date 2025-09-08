package no.hvl.dat250.lecture07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    private CalculationInterface calculator; // use dependency

    public App(@Autowired CalculationInterface calculator) {
        this.calculator = calculator;
    }

    public void doIt() {
        double a = 5.0;
        double b = 3.0;
        double result = this.calculator.calculate(a, b);
        System.out.println("Result is " + result);
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        App app = new App(context.getBean(CalculationInterface.class)); // creation dependency
        app.doIt();
    }
}

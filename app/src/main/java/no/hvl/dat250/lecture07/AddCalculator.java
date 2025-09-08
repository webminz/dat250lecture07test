package no.hvl.dat250.lecture07;

public class AddCalculator implements CalculationInterface {
    @Override
    public double calculate(double lhs, double rhs) {
        return lhs + rhs;
    }
}
